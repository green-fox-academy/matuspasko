package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String str = "so tist";

        System.out.println("Character is in sentence: " + howManyTimes(str));
        System.out.println("Most occurence lether on the end of wors is: " + howManyTimesOnTheEndOfWord(str));
        System.out.println("Most occurence leather is there:  " + howMany(str));
    }

    public static int howManyTimes(String sentence) {

        int count = 0;

        char character = 'i';

        char[] charAllsentence = sentence.toCharArray();

        for (int i = 0; i < charAllsentence.length; i++) {
            if (charAllsentence[i] == character) {
                count++;
            }
        }
        return count;
    }

    public static int howManyTimesOnTheEndOfWord(String sentence) {

        String[] sentenceStr = sentence.split(" ");
        String inputCharacter = "o";
        int count = 0;

        for (int i = 0; i < sentenceStr.length; i++) {
            if (sentenceStr[i].endsWith(inputCharacter)) {
                count++;
            }
        }
        return count;
    }

    public static int howMany(String sentence) {

        int count = 0;
        char charS = 0;

        char[] charAllsentence = sentence.toCharArray();
        Map<Character, Integer> mapOfChar = new HashMap<>();

        for (int i = 0; i < charAllsentence.length; i++) {
            if (mapOfChar.containsKey(charAllsentence[i])) {
                mapOfChar.put(charAllsentence[i], mapOfChar.get(charAllsentence[i]) + 1);
            } else {
                mapOfChar.put(charAllsentence[i], 1);
            }
        }

        for (Map.Entry mapa : mapOfChar.entrySet()) {
            if ((int) mapa.getValue() > count) {
                count = (int) mapa.getValue();
                charS = (char) mapa.getKey();
            }
        }
        System.out.println("Is leather: " + charS);
        return count;
    }
}

