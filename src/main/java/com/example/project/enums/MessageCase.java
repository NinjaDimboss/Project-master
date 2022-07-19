package com.example.project.enums;

public enum MessageCase {
    USER_NOT_FOUND("Username incorrect!");

    private final String message;

    MessageCase(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
