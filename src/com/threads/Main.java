package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        UnsynchronizedBuffer buffer = new UnsynchronizedBuffer();
        Producer producer = new Producer(buffer);

        System.out.println("Action\t\tValue\tSum of Produced\tSum of Consumed" );
        System.out.println("------\t\t-----\t---------------\t---------------\n" );

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Producer(buffer));
        executorService.execute(new Consumer(buffer));

        executorService.shutdown();
    }
}
