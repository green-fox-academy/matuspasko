package com.greenfox.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Random;

@Entity
@Table(name = "urles")
public class Url {

    @Id
    @GeneratedValue
    private long id;
    private String urol;
    private String alias;
    private String secretCode;

    public void createCode(){
        int max=9999;
        int min= 1111;
        Random random = new Random();
        this.secretCode = random.nextInt((max - min) + 1));
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrol() {
        return urol;
    }

    public void setUrol(String urol) {
        this.urol = urol;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Url() {
    }

    public Url(String urol, String alias) {
        this.urol = urol;
        this.alias = alias;
        this.createCode();
    }
}
