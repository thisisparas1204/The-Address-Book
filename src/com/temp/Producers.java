package com.temp;

import java.util.Random;

public class Producers implements Runnable {
    private final Buffer buffer;
    private static final Random random = new Random();

    public Producers(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            try {
                Thread.sleep(random.nextInt(3000));
                buffer.set(i);
            } catch (InterruptedException ignored) {

            }
        }
        System.out.println("Producer done writing.\nTerminating producing.\n");
    }

}
