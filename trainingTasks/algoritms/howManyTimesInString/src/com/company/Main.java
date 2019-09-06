package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String str = "kkkkkkj";
        String str2 = "ho jo ho ho";
        System.out.println(occurenceInString(str));
        System.out.println(occurenceSentence(str2));
    }

    public static int occurenceInString(String str) {
        int count = 0;
        char leather = 0;

        Map<Character, Integer> stringMap = new HashMap<>();

        char[] stringChar = str.toCharArray();

        for (int i = 0; i < stringChar.length; i++) {
            if (stringMap.containsKey(stringChar[i])) {
                stringMap.put(stringChar[i], stringMap.get(stringChar[i]) + 1);

            } else {
                stringMap.put(stringChar[i], 1);
            }
        }

        for (Map.Entry character : stringMap.entrySet()) {
            if ((int) character.getValue() > count) {
                count = (int) character.getValue();
                leather = (char) character.getKey();
            }
        }
        System.out.println(leather);
        return count;
    }

    public static int occurenceSentence(String str) {

        String[] stringSentence = str.split(" ");

        Map<String, Integer> sentenceMap = new HashMap<>();

        int count = 0;

        for (int i = 0; i < stringSentence.length; i++) {
            if (sentenceMap.containsKey(stringSentence[i])) {
                sentenceMap.put(stringSentence[i], sentenceMap.get(stringSentence[i]) + 1);
            } else {
                sentenceMap.put(stringSentence[i], 1);
            }
        }

        for (Map.Entry word : sentenceMap.entrySet()) {
            if ((int) word.getValue() > count) {
                count = (int) word.getValue();
            }
        }
        return count;
    }
}



