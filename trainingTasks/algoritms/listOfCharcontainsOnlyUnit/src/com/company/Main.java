package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(meno("matuus"));


        String str = "matus";


    }

    public static List<Character> meno(String name) {

        List<Character> newCharacters = new ArrayList<>();

        char[] characters = name.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (!newCharacters.contains(characters[i])) {
                newCharacters.add(characters[i]);
            }
        }
        return newCharacters;
    }


//
//    String reverse = str.chars()
//            .mapToObj(c -> (char) c)
//            .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
//
//        System.out.println(reverse);

}
