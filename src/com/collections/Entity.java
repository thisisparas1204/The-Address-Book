package com.collections;

import java.util.Random;

public class Entity {
    public static void main(String[] args) {

        Random random = new Random();

        int result = (int) (Math.random() * ((100 - 50) + 1)) + 50;
        /*             (int) (Math.random() * (50 + 1)) + 50;
                        (int) (Math.random() * 51) + 50;
                        (int)  32.344334455 + 50;
                        (int) 82.344334455;
            result = 82;
        *
        */
        System.out.println(result);

    }
}
