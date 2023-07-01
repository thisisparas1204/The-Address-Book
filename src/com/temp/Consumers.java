package com.temp;

import java.util.Random;

public class Consumers implements Runnable {
    private final Buffer buffer;
    private static final Random random = new Random();

    public Consumers(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            try {
                Thread.sleep(random.nextInt(3000));
                System.out.println(buffer.get());
            } catch (InterruptedException ignored) {

            }
        }
        System.out.println("Consumer done reading.\nTerminating consuming.\n");
    }
}
