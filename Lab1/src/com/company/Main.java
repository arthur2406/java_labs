package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // Task 5

    public static boolean hasOnlyUniqueChars(String word) {
        // If at any time we encounter 2 same
        // characters, return false
        for (int i = 0; i < word.length(); i++)
            for (int j = i + 1; j < word.length(); j++)
                if (word.charAt(i) == word.charAt(j))
                    return false;

        // If no duplicate characters encountered,
        // return true
        return true;
    }

    public static void main(String[] args) {

	    ArrayList<String> words = new ArrayList<String>(Arrays.asList("hex", "wow", "do", "execute", "word", "repeat"));
        ArrayList<String> wordsWithUniqueChars = new ArrayList<String>();

        for (String word : words) {
            if (Main.hasOnlyUniqueChars(word))
            {
                wordsWithUniqueChars.add(word);
            }
        }

        for (String word : wordsWithUniqueChars) {
            System.out.println(word);
        }

    }
}
