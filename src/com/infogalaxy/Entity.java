package com.infogalaxy;

public class Entity {
    private String name;
    private int age;

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        Entity entity = (Entity) object;
        return (this.name == entity.name) && (this.age == entity.age);
    }
}
