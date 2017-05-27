package com.example.demo.login;

/**
 * Created by karan on 27/5/17.
 */
public class LoginResponse {
    boolean success;
    Integer id;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
