package com.prashanth;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFuture05 {

    public static void main(String[] args) {
        String testStr = "Complete01";
        StringBuilder result = new StringBuilder();

        // then accept
        CompletableFuture.completedFuture(testStr)
                .thenApply(String::toUpperCase)
                .thenAcceptBoth(CompletableFuture.completedFuture(testStr)
                                .thenApply(String::toLowerCase),(s1, s2) -> result.append(s1).append(" ").append(s2));

        System.out.println(result);
    }


}
