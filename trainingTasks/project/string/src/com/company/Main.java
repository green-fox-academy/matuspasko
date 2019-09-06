package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // return a list of characters, which contains only unit letters

        System.out.println(uniqueCharacters("matus"));
    }

    public static List<Character> uniqueCharacters(String str) {

        List<Character> newCharacters = new ArrayList<>();

        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (!newCharacters.contains(characters[i])) {
                newCharacters.add(characters[i]);
            }
        }
        return newCharacters;
    }
}


