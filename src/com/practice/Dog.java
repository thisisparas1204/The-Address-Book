package com.practice;

public class Dog implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }

    public void growl() {
        System.out.println("Grr...");
    }
}
