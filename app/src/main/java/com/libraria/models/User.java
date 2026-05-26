package com.libraria.models;

public class User {
    private String username;
    private String password;
    private String secretquestion;
    private String secretanswer;

    public User(String username, String password, String secretquestion, String secretanswer) {
        this.username = username;
        this.password = password;
        this.secretquestion = secretquestion;
        this.secretanswer = secretanswer;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSecretquestion() {
        return secretquestion;
    }
    
    public String getSecretanswer() {
        return secretanswer;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSecretquestion(String secretquestion) {
        this.secretquestion = secretquestion;
    }

    public void setSecretanswer(String secretanswer) {
        this.secretanswer = secretanswer;
    }
}