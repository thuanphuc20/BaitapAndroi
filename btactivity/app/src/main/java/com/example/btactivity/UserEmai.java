package com.example.btactivity;

import java.io.Serializable;

public class UserEmai implements Serializable {
    private String email;
    private  String use;

    public UserEmai(String email, String use) {
        this.email = email;
        this.use = use;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }
}
