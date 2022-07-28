package com.gruppo3.ai.lab3.model;

import org.springframework.data.annotation.Id;

public class Role {

    @Id
    private String id;
    private String name;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
