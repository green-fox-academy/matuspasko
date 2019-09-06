package com.greenfox.aliasurl.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Random;

@Entity
@Table(name = "links")
public class Link {

    @Id
    @GeneratedValue
    private long id;
    private String url;
    private String alias;
    private int secretCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(int secretCode) {
        this.secretCode = secretCode;
    }

    public Link(String url, String alias) {
        this.url = url;
        this.alias = alias;
        this.secretCode = createCode();
    }

    public Link() {
        this.secretCode = createCode();
    }

    private int createCode(){
     return (int) (Math.random() * 8999 + 1000);
    }
}
