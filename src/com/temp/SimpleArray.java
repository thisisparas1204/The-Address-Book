package com.temp;

import java.util.Arrays;
import java.util.Random;

public class SimpleArray {
    private final int[] array;
    private int writeIndex = 0;
    private static final Random random = new Random();

    public SimpleArray(int size) {
        array = new int[size];
    }

    public synchronized void add(int value) {
        int position = writeIndex;
        try {
            Thread.sleep(random.nextInt(500));
        } catch (InterruptedException ignored) {

        }

        array[position] = value;
        System.out.printf("%s wrote %d to index %d\n", Thread.currentThread().getName(), value, writeIndex);
        writeIndex++;
        System.out.printf("Next write index: %d\n", writeIndex);
    }

    @Override
    public String toString() {
        return "Contents of SimpleArray:\n" + Arrays.toString(array);
    }
}
