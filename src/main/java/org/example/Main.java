package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Initialize word list and add words
        WordList wordList = new WordList();
        wordList.addWord("apple");
        wordList.addWord("banana");
        wordList.addWord("orange");
        wordList.addWord("strawberry");
        // Initialize player
        Player player = new Player();
        // Get player's name
        String name = player.getName();
        // Display greeting with player's name
        System.out.println("Hello, " + name + "! Welcome to Hangman.");

        while (true) {
            // Get a random word from the word list
            String word = wordList.getRandomWord();
            // Initialize game with the random word and 5 lives
            Hangman game = new Hangman(word, 3);

            while (!game.isWon() && !game.isLost()) {
                // Display the word with blanks for unguessed letters
                System.out.println("Word: " + game.getWordWithBlanks());
                // Display the number of lives remaining
                System.out.println("Guessed Letters so far: " + game.lettersGuessed);
                System.out.println("Lives remaining: " + game.getLives());

                // Get player's guess
                char guess = player.getGuess();
                // Process the guess
                boolean correct = game.guessLetter(guess);
                if (correct) {
                    System.out.println("Correct guess!");
                } else {
                    System.out.println("Incorrect guess!");
                }
                // Check the number of lives remaining and print the hangman drawing
                if (game.getLives() == 2) {
                    System.out.println("   ");
                    System.out.println("   ");
                    System.out.println("   ");
                    System.out.println("   ");
                    System.out.println("   ");
                    System.out.println("   ");
                    System.out.println("_____");
                } else if (game.getLives() == 1) {
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("___|___");
                } else if (game.getLives() == 0) {
                    // If the player has no lives left, print a message and the hangman drawing
                    System.out.println("END OF GAME NO GUESSES LEFT");
                    System.out.println("   ____________");
                    System.out.println("   |/          |");
                    System.out.println("   |          (_)");
                    System.out.println("   |           |");
                    System.out.println("   |           | ");
                    System.out.println("   |          / \\");
                    System.out.println("   |              ");
                    System.out.println("___|___           ");
                    System.out.println("The word was " + word);
                }
                // Display the final word
                System.out.println("Word: " + game.getWordWithBlanks());

                if (game.isWon()) {
                    System.out.println("Congratulations, you won!");
                } else {
                    System.out.println("You lost. Better luck next time.");
                }

                // Ask the player if they want to play again
                if (!player.wantsToPlayAgain()) {
                    break;
                }
            }
        }
    }
}