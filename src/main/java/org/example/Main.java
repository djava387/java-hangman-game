package org.example;
public class Main {
    public static void main(String[] args) {
// Create a new WordList
        WordList wordList = new WordList();
// Add some words to the list
        wordList.addWord("BATMAN");
        wordList.addWord("JOKER");
        wordList.addWord("MATRIX");
        wordList.addWord("TITANIC");
        // Get a random word from the WordList
        String word = wordList.getRandomWord();
// Create a new Hangman game with the chosen word and 3 lives
        Hangman hangman = new Hangman(word, 3);
// Create a new Player
        Player player = new Player();

// While the game is not won or lost, keep playing
        while (!hangman.isWon() && !hangman.isLost()) {
            // Print the current word with blanks for unguessed letters
            System.out.println("Word: " + hangman.getWordWithBlanks());
            // Print the letters that have been guessed so far
            System.out.println("Guessed Letters so far: " + hangman.lettersGuessed);
            // Print the number of lives remaining
            System.out.println("Lives: " + hangman.getLives());

            // Get the player's guess
            char guess = player.getGuess();
            // Check if the guess is correct
            if (hangman.guessLetter(guess)) {
                // If the guess is correct, print a message
                player.printMessage("Correct!");
            } else {
                // If the guess is incorrect, print a message
                player.printMessage("Incorrect!");
            }

            // Check the number of lives remaining and print the hangman drawing
            if (hangman.getLives() == 2) {
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("_____");
            } else if (hangman.getLives() == 1) {
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
            } else if (hangman.getLives() == 0) {
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
                System.out.println("The word was " + word + " LIVES LEFT : " + hangman.getLives());
            }
            // If the game is won, print a message
            if (hangman.isWon()) {
                player.printMessage("You won!");
            }
        }
    }
}
