package com.example.welcome;

public class WelcomeResponse {

    private final String message;

    public WelcomeResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
