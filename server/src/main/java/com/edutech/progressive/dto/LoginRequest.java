package com.edutech.progressive.dto;

public class LoginRequest {

    // The username of the customer attempting to log in.
    private String username;

    // The password of the customer attempting to log in.
    private String password;

    public LoginRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
