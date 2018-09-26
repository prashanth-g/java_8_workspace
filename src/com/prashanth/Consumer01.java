package com.prashanth;

import java.util.function.Consumer;

public class Consumer01 {

    public static void main(String[] args) {

        System.out.println("Consumer example");
        Consumer<String> consumer = Consumer01::printLocales;
        consumer.accept("en-in");
        consumer.accept("en-us");
    }

    private static void printLocales(String locale) {
        System.out.println(locale);
    }
}
