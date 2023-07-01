package com.collections;

import java.util.Objects;

public class Students {
    private String name;
    private int id;
    private static final String COLLEGE;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    static {
        COLLEGE = "ASC";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", College: " + COLLEGE;
    }
}
