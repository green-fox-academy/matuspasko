package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Soulution by Juraj: " + mostOccuret("haaaaaaloooooooooo"));

        System.out.println("This is most occurent character : " + mostOccurentCharacter("haaaaaallloooooooooo"));

        System.out.println("This solution is by Ales: " + thisIsChar("haaaaaaloooooooooo"));

    }

    public static char mostOccurentCharacter(String word) {

        char[] wordToCharacter = word.toCharArray();

        Map<Character, Integer> mapOfCharacters = new HashMap<>();
        char temp;
        int valuOfChar = 0;
        int countCompare = 0;
        char tempKeyChar;
        char finalChar = 0;

        for (int i = 0; i < wordToCharacter.length; i++) {
            temp = wordToCharacter[i];
            if (mapOfCharacters.containsKey(wordToCharacter[i])) {
                mapOfCharacters.put(temp, mapOfCharacters.get(temp) + 1);
            } else {
                mapOfCharacters.put(temp, 1);
            }
        }

        for (Map.Entry character : mapOfCharacters.entrySet()) {
            tempKeyChar = (char) character.getKey();
            valuOfChar = (int) character.getValue();
            if (valuOfChar > countCompare) {
                countCompare = valuOfChar;
                finalChar = tempKeyChar;
            }

        }
        return finalChar;

    }


    public static char mostOccuret(String word) {


        Map<Character, Integer> charactersInMap = new HashMap<>();

        char leather = 0;
        char[] wordToChar = word.toCharArray();
        int mostCommon = 0;
        char mostCommonCharatkter = 0;


        for (int i = 0; i < wordToChar.length; i++) {
            leather = (wordToChar[i]);
            if (charactersInMap.containsKey(leather)) {
                charactersInMap.put(leather, charactersInMap.get(leather) + 1);
            } else {
                charactersInMap.put(leather, 1);
            }
        }

        for (Map.Entry character : charactersInMap.entrySet()) {
            if ((int) character.getValue() > mostCommon) {
                mostCommon = (int) character.getValue();
                mostCommonCharatkter = (char) character.getKey();

            }
        }

        return mostCommonCharatkter;
    }


    public static char thisIsChar(String str) {

        int[] count = new int[5000];
        for (int i = 0; i < str.length(); i++) {
            count[str.toLowerCase().charAt(i)]++;
        }

        int max = 0;
        char mostOccuredCharacter = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (max < count[str.toLowerCase().charAt(i)]) {
                max = count[str.charAt(i)];
                mostOccuredCharacter = str.charAt(i);
            }
        }

        return mostOccuredCharacter;
    }
}
