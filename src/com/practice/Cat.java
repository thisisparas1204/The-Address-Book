package com.practice;

public class Cat implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Meow meow.");
    }

    public void kittyThingy() {
        System.out.println("Doing kitty things.");
    }
}
