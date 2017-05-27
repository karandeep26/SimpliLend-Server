package com.example.demo.signup;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by karan on 27/5/17.
 */
public class SignUpResponse {
    boolean success;
    int id;




    public void setId(int id) {
        this.id = id;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getId() {
        return id;
    }
}
