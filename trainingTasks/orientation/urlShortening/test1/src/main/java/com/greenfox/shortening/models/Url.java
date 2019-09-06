package com.greenfox.shortening.models;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "urls")
public class Url {

    @Id
    @GeneratedValue
    private long id;
    private String url;
    private String alias;
//    private String secretCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

//    public String getSecretCode() {
//        return secretCode;
//    }
//
//    public void setSecretCode(String secretCode) {
//        this.secretCode = secretCode;
//    }

    public Url(String url, String alias) {
        this.url = url;
        this.alias = alias;
//        this.secretCode = secretCode;
    }

    public Url() {
    }
}
