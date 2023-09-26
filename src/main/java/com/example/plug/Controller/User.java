package com.example.plug.Controller;
import java.time.LocalDateTime;
public class User {

    public String login;
    public String password;
    public LocalDateTime date;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, LocalDateTime date) {
        this.login = login;
        this.password = password;
        this.date = date;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime setDate() {
        return date;
    }
}
