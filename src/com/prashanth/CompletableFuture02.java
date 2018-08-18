package com.prashanth;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture02 {
    public static void main(String... args) throws
            ExecutionException, InterruptedException {

        // get completed - test
        CompletableFuture cf01 = CompletableFuture.completedFuture("completed01");
        System.out.println(cf01.isDone());
        System.out.println(cf01.get());

        // run Async
        CompletableFuture cf02 = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().isDaemon()); // Check deamon
        });

        System.out.println(cf02.isDone());

        // thenApply
        CompletableFuture cf03 = CompletableFuture.completedFuture("completed03").thenApply(s -> {
            System.out.println(Thread.currentThread().isDaemon());
            return s.length();
        });

        System.out.println(cf03.get());
    }
}
