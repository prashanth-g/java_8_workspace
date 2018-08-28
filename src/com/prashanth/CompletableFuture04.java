package com.prashanth;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture04 {
    public static void main(String... args) {
        StringBuilder result = new StringBuilder();
        CompletableFuture<Void> cf = CompletableFuture.completedFuture("thenAsync01")
                .thenAcceptAsync(result::append);
        cf.join();
        System.out.println(result.length());
    }
}
