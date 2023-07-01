package com.threads;

public class UnsynchronizedBuffer implements IBuffer{

    private int buffer = -1;
    boolean occupied = false;
    @Override
    public synchronized void set(int value) throws InterruptedException {
        while (occupied) {
            System.out.println( "Producer tries to write." );
            wait();
        }
        buffer = value;
        System.out.printf( "Producer writes\t%2d", value );
        occupied = true;
        notifyAll();
    }

    @Override
    public synchronized int get() throws InterruptedException {
        while (!occupied) {
            System.out.println("Consumer tries to read.");
            wait();
        }
        occupied = false;
        System.out.printf( "Consumer reads\t%2d", buffer );
        notifyAll();
        return buffer;
    }
}
