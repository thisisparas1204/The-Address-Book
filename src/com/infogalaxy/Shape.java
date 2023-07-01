package com.infogalaxy;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  String getColor() {
        return this.color;
    }

    public Shape() {

    }

    public abstract double getArea();
}
