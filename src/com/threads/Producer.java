package com.threads;

import java.util.Random;

public class Producer implements Runnable {
    private final IBuffer buffer;
    private static final Random random = new Random();

    public Producer(IBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; ++i) {
            try {
                Thread.sleep(random.nextInt(3000));
                buffer.set(i);
                sum += i;
                System.out.printf( "\t%2d\n", sum );
            } catch (InterruptedException ignored) {}
        }

        System.out.println("Producer done producing\nTerminating Producer" );
    }
}
