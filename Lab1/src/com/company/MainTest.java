package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void hasOnlyUniqueChars() {

        // Test data
        String word1 = "asap";
        String word2 = "eye";
        String word3 = "like";

        // Assertions
        Assert.assertFalse(Main.hasOnlyUniqueChars(word1));
        Assert.assertFalse(Main.hasOnlyUniqueChars(word2));
        Assert.assertTrue(Main.hasOnlyUniqueChars(word3));
    }

    @Test
    public void main() {

        // Test data
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("hex", "wow", "do", "execute", "word", "repeat"));
        ArrayList<String> wordsWithUniqueChars = new ArrayList<String>();
        ArrayList<String> expectedWords = new ArrayList<String>(Arrays.asList("hex", "do", "word"));

        for (String word : words) {
            if (Main.hasOnlyUniqueChars(word))
            {
                wordsWithUniqueChars.add(word);
            }
        }


        // Assertions
        Assert.assertArrayEquals(wordsWithUniqueChars.toArray(), expectedWords.toArray());

    }
}