package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String str = "mutus";

        System.out.println(uniqChar(str));
        System.out.println(existCharacters(str));

    }

    public static List<Character> uniqChar(String name) {

        List<Character> characters = new ArrayList<Character>();

        char[] stringCharacter = name.toCharArray();

        for (int i = 0; i < stringCharacter.length; i++) {
            if (!characters.contains(stringCharacter[i])) {
                characters.add(stringCharacter[i]);
            }
        }
        return characters;
    }

    public static List<Character> existCharacters(String name) {

        List<Character> extistChar = new ArrayList<Character>();


        char[] nameCharacter = name.toCharArray();
        int count = 0;

        for (int i = 0; i < nameCharacter.length; i++) {
            for (int j = 0; j < nameCharacter.length; j++) {
                if (nameCharacter[i] == nameCharacter[j]) {
                    count += 1;
                }
            }
            if (count >= 2) {
                extistChar.add(nameCharacter[i]);
                count = 0;
            } else {
                count = 0;
            }
        }
        return extistChar;
    }
}



