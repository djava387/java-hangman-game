package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordList {
    // Declare a list to hold the words and a random number generator
    private List<String> words;
    private Random random;

    // Constructor to initialize the fields
    public WordList() {
        words = new ArrayList<>();
        random = new Random();
    }

    // Method to add a word to the list
    public void addWord(String word) {
        words.add(word);
    }

    // Method to get a random word from the list
    public String getRandomWord() {
        // Generate a random index
        int index = random.nextInt(words.size());
        // Return the word at the randomly generated index
        return words.get(index);
    }

}
