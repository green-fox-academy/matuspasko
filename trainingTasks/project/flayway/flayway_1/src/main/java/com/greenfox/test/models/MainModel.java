package com.greenfox.test.models;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PERSON")
public class MainModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
}
