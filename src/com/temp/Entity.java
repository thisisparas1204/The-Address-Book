package com.temp;

import java.util.Random;

public class Entity  {
    private static final Random random = new Random();
    public void display(String message) {
        System.out.printf("[%s", message);
        try {
            Thread.sleep(random.nextInt(500));
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("]");
    }

}
