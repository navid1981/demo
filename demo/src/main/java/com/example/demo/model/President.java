package com.example.demo.model;

import java.io.Serializable;

/*
    Created By Navid Salehvaziri at 9/21/2018
*/
public class President implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
