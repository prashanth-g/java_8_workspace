package com.prashanth;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Period01 {

    public static void main(String[] args) {

        Period days = Period.ofDays(5);

        System.out.println(days.getDays());

        Period yearsMonthsDates = Period.of(3, 5, 8);

        System.out.println(yearsMonthsDates.getYears());

        LocalDate date01 = LocalDate.of(1982, Month.JULY, 15);
        LocalDate date02 = LocalDate.of(2018, Month.AUGUST, 21);

        Period diffPeriod = Period.between(date01, date02);

        System.out.print(diffPeriod.getYears() + " years,");
        System.out.print(diffPeriod.getMonths() + " months,");
        System.out.print(diffPeriod.getDays() + " days");
    }
}
