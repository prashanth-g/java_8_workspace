package com.prashanth;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 01 Handling Errors
        String cF = null;
        CompletableFuture<String> completableFuture
                =  CompletableFuture.supplyAsync(() -> {
            if (cF == null) {
                throw new RuntimeException("Error!");
            }
            return "Hello, " + cF;
        }).handle((s, t) -> s != null ? s : "Handled");

        System.out.println(completableFuture.get());

        // 02 Combining
        CompletableFuture<String> cF01
                = CompletableFuture.supplyAsync(() -> "cF01");
        CompletableFuture<String> cF02
                = CompletableFuture.supplyAsync(() -> "cF02");

        CompletableFuture<Void> combinedFuture
                = CompletableFuture.allOf(cF01, cF02);

        combinedFuture.get();

        System.out.println(cF01.isDone());

    }
}
