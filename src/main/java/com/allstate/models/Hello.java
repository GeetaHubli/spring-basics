package com.allstate.models;

public class Hello {
    private String message;
    private int id;


    public Hello(String message, int id) {
        this.message = message;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }
}
