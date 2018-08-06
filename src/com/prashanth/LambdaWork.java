package com.prashanth;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class LambdaWork {
    public static void main(String[] args) throws IOException {
        // 1
        IntStream
                .range(1, 10)
                .forEach(System.out::println);

        // 2
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));

        // 3
        System.out.println(
                IntStream.range(1, 10).sum());

        // 4
        Stream.of("Ava","Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // 5
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        // 6
        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        // 7
        List<String> people = Arrays.asList("Al", "Ankit", "Brent");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("s"))
                .forEach(System.out::println);

        // 8
        Stream<String> bands = Files.lines(Paths.get("bands.txt"));

        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);

        bands.close();

        // 9
        List<String> band2 = Files.lines(Paths.get("resources/bands.txt"))
                .map(String::toLowerCase)
                .filter(x -> x.contains("la"))
                .collect(Collectors.toList());

        band2.forEach(x -> System.out.println(x));

        // 10
        Stream<String> band3 = Files.lines(Paths.get("resources/data.txt"));
        int rowCount = (int) band3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3).count();
        System.out.println(rowCount);
        band3.close();

        // 11
        Stream<String> band4 = Files.lines(Paths.get("resources/data.txt"));
        band4
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " +x[1]));
        band4.close();

        // 12
        Stream<String> band5 = Files.lines(Paths.get("resources/data.txt"));

        Map<String, Integer> map = new HashMap<>();

        map = band5
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x-> Integer.parseInt(x[1])));
        band5.close();

        for(String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        // 13
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total "+total);

        // 14
        IntSummaryStatistics summary = IntStream.of(7,2,19,88,10)
                .summaryStatistics();
        System.out.println(summary);

    }
}