package com.threads;

public interface IBuffer {

    public void set(int value) throws InterruptedException;
    public int get() throws InterruptedException;
}
