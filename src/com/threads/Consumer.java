package com.threads;

import java.util.Random;

public class Consumer implements Runnable {
    private static final Random random = new Random();
    private final IBuffer buffer;

    public Consumer(IBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; ++i) {
            try {
                Thread.sleep(random.nextInt(3000));
                sum += buffer.get();
                System.out.printf( "\t\t\t%2d\n", sum );
            } catch (InterruptedException ignored) {
            }
        }
        System.out.printf( "\n%s %d\n%s\n","Consumer read values totaling", sum, "Terminating Consumer" );
    }
}
