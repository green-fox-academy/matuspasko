package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String sentence = "Youuu had oneeeeeee of the most hardest algorithm";
        System.out.println("That leather is there : " + wordsEnds(sentence));
    }

    public static int wordsEnds(String sentence) {

        String word;
        int compareTo = 0;
        char finalChar = 0;

        List<String> arrayWithSentence = new ArrayList<>();
        HashMap<Character, Integer> howManyTimes = new HashMap<>();
        arrayWithSentence.add(sentence);

        for (String senteceA : arrayWithSentence) {
            String[] words = senteceA.split(" ");


            for (int i = 0; i < words.length; i++) {
                word = words[i];


                        String reverse = word.chars()
                        .mapToObj(c -> (char) c)
                        .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);

                reverse = reverse.toLowerCase();

                char[] charactersWord = reverse.toCharArray();

                for (int j = 0; j < charactersWord.length; j++) {
                    if (j == 0) {
                        if (howManyTimes.containsKey(charactersWord[j])) {
                            howManyTimes.put(charactersWord[j], howManyTimes.get(charactersWord[j]) + 1);
                        } else {
                            howManyTimes.put(charactersWord[j], 1);
                        }
                    }
                }

                for (Map.Entry leatherInChar : howManyTimes.entrySet()) {

                    if (compareTo < (int) leatherInChar.getValue()) {
                        compareTo = (int) leatherInChar.getValue();
                        finalChar = (char) leatherInChar.getKey();
                    }
                }
            }
            System.out.println("Most occurence character on the end of words is : " + Character.toUpperCase(finalChar) + " with: " + compareTo + " repeats");
        }
        return compareTo;
    }
}
