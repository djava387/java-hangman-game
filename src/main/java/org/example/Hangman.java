package org.example;

public class Hangman extends Game {
    public Hangman(String word, int lives) {
        // Call the superclass's constructor with the word and lives parameters
        super(word, lives);
    }


    public String getWordWithBlanks() {
        // Initialize a char array with the same length as the word and fill it with underscores
        char[] wordArray = new char[word.length()];
        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = '_';
        }

        // Replace each underscore with the corresponding letter in the word if it has been guessed
        for (int i = 0; i < wordArray.length; i++) {
            if (lettersGuessed.contains(word.charAt(i))) {
                wordArray[i] = word.charAt(i);
            }
        }

        // Return the word with blanks as a string
        return new String(wordArray);
    }

    public boolean isWon() {
        // Check if all the letters in the word have been guessed
        for (char c : word.toCharArray()) {
            if (!lettersGuessed.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean isLost() {
        // Return whether the number of lives remaining is 0
        return lives == 0;
    }
}
