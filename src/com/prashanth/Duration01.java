package com.prashanth;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Duration01 {

    public static void main(String args[]) {

        // Time Unit
        Duration oneHours2 = Duration.of(1, ChronoUnit.MINUTES);
        System.out.println(oneHours2.getSeconds() + " seconds");

        LocalDateTime date01 = LocalDateTime.of(2018, Month.AUGUST,
                17, 8, 21, 00);
        LocalDateTime date02 = LocalDateTime.of(2018, Month.SEPTEMBER,
                12, 11, 25, 55);

        // duration between dates
        Duration duration = Duration.between(date01, date02);

        System.out.println(duration.getSeconds() + " seconds");
    }

}
