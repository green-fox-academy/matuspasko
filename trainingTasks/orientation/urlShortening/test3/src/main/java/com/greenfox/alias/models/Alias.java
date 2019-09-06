package com.greenfox.alias.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alias")
public class Alias {

    @Id
    @GeneratedValue
    private long id;
    private String alias;
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Alias(String alias, String address) {
        this.alias = alias;
        this.address = address;
    }

    public Alias() {
    }
}
