package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
    // instance variables
    protected String word; // word to be guessed
    protected List<Character> lettersGuessed; // list of letters already guessed
    protected int lives; // number of lives left

    // constructor
    public Game(String word, int lives) {
        this.word = word;
        this.lives = lives;
        lettersGuessed = new ArrayList<>(); // initialize lettersGuessed as empty list
    }

    // abstract methods to be implemented by subclasses
    public abstract String getWordWithBlanks(); // returns the word with blanks for unguessed letters

    public abstract boolean isWon(); // returns true if the word has been completely guessed

    public abstract boolean isLost(); // returns true if all lives have been lost

    // getter for lives
    public int getLives() {
        return lives;
    }

    // method to process a letter guess
    public boolean guessLetter(char letter) {
        if (lettersGuessed.contains(letter)) { // if letter has already been guessed, return false
            return false;
        }
        lettersGuessed.add(letter); // add letter to lettersGuessed

        if (word.contains(Character.toString(letter))) { // if letter is in word, return true
            return true;
        } else { // if letter is not in word, decrease lives and return false
            lives--;
            return false;
        }
    }
}