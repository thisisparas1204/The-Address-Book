package com.temp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        SimpleArray simpleArray = new SimpleArray(6);
//        ArrayWriter arrayWriter1 = new ArrayWriter(simpleArray, 1);
//        ArrayWriter arrayWriter2 = new ArrayWriter(simpleArray, 11);
//
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(arrayWriter1);
//        executorService.execute(arrayWriter2);
//
//        executorService.shutdown();
//
//        boolean taskEnded = executorService.awaitTermination(1, TimeUnit.MINUTES);
//
//        System.out.println(simpleArray);
//        System.out.println("Main thread exiting");

        Entity entity = new Entity();
        EntityOperation entityOperation1 = new EntityOperation(entity, "Hello");
        EntityOperation entityOperation2 = new EntityOperation(entity, "World");
        EntityOperation entityOperation3 = new EntityOperation(entity, "Synchronized");

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(entityOperation1);
        executorService.execute(entityOperation2);
        executorService.execute(entityOperation3);

        boolean result = executorService.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Main thread exiting.");

    }
}
