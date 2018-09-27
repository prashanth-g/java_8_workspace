package com.prashanth;

import java.util.function.Consumer;

public class Consumer02 {

    public static void main(String[] args) {

        Consumer<String> consumer01 = (arg) -> { System.out.println(arg);};

        consumer01.accept("Consumer02-Accept");

        Consumer < String > consumer2 = (x) -> { System.out.println(x + " Completed "); };

        consumer01.andThen(consumer2).accept("Consumer02-AfterThen");
    }
}
