package com.prashanth;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Suppliers01 {

    public static void main(String[] args) {

        IntSupplier i = ()-> Integer.MAX_VALUE;
        System.out.println(i.getAsInt());

        Supplier<String> baseSupplier = () -> "Supplier-01";
        String base = baseSupplier.get();
        System.out.println("baseSupplier : "+base);


        Supplier<String> emptyStringSupplier = String::new;
        String empty = emptyStringSupplier.get();
        System.out.println("empty String Supplier : "+empty);


        Supplier<Long> timeSupplier= Suppliers01::getCurrentTimeInMs;
        Long currentTime = timeSupplier.get();
        System.out.println("currentTime : " + currentTime);

    }

    private static long getCurrentTimeInMs() {
        return System.currentTimeMillis();
    }
}
