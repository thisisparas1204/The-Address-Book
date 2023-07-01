package com.temp;

public class SynchronizedBuffer implements Buffer {
    private int buffer = -1;
    boolean occupied = false;

    @Override
    public synchronized void set(int value) throws InterruptedException {
        while (occupied) {
            System.out.println("Producer tries to write.");
            wait();
        }
        buffer = value;
        System.out.printf("Producer writes: %d\n", value);
        occupied = true;
        notifyAll();
    }

    @Override
    public synchronized int get() throws InterruptedException {
        while (!occupied) {
            System.out.println("Consumer tries to read.");
            wait();
        }
        System.out.print("Consumer reads: " + buffer);
        occupied = false;
        notifyAll();
        return 0;
    }
}
