package com.example.REST.domain;

public class CustomErrorType {
    private String errorMessage;

    public CustomErrorType(String errorMessage) {
        errorMessage = errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
