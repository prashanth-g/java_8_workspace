package com.prashanth;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFuture03 {
    public static void main(String... args) throws InterruptedException,
            ExecutionException {
        System.out.println(calculateAsync().get());
    }

    // 01 complete()
    private static Future<String> calculateAsync() {
        CompletableFuture<String> completableFuture
                = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(100);
            completableFuture.complete("Completed!");
            return null;
        });

        return completableFuture;
    }
}
