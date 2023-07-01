package com.practice;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        Dog dog = new Dog();
//        doAnimalStuff(dog);
//        IAnimal animal2 = new Cat();
//        doAnimalStuff(animal2);

//        Dog dog = new Dog() {
//          @Override
//          public void makeSound() {
//              System.out.println("Hey I'm a German Shepherd.");
//          }
//        };
//
//        dog.makeSound();

    }

    public static void doAnimalStuff(IAnimal animal) {
        animal.makeSound();
        if (animal instanceof Dog dog) {
            dog.growl();
        } else if (animal instanceof Cat cat) {
            cat.kittyThingy();
        }
    }
}
