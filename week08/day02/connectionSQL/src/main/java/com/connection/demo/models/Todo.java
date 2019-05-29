package com.connection.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Todo(){

    }
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public long getId() {
        return id;
    }
    public Todo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
    }

    public String getTitle() {
        return title;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public Todo(String title) {
        this.title = title;
    }

    public Todo(boolean isDone) {
        this.isDone = isDone;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
    @Override
    public String toString (){
        return title;
    }
}