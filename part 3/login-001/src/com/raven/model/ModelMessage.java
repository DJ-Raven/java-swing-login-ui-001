package com.raven.model;

public class ModelMessage {

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ModelMessage(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ModelMessage() {
    }

    private boolean success;
    private String message;
}
