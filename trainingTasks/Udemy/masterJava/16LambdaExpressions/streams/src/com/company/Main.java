package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "g50",
                "I26", "I17", "I29",
                "071");

        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(number -> {
//            if (number.toUpperCase().contains("G")) {
//                gNumbers.add(number);
//                System.out.println(number);

//            }

//        });
//        System.out.println(gNumbers);

//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach(String s) -> System.out.println(s);
        someBingoNumbers
        .stream()
                .map(String::toUpperCase)
                .filter(s ->s.startsWith("G") )
                .sorted()
                .forEach(System.out::println);

    }
}
