package com.example.logintest;

public class ResponseModel {

    private String message;

    public ResponseModel(String message) {
        this.message = message;
    }

    public ResponseModel() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
