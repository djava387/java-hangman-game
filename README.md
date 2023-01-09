HangmanGame

A simple game that involves guessing a word one letter at a time.

Classes

The project consists of the following classes:

WordList

The WordList class is used to store a list of words and provides a method for getting a random word from the list.

Game

The Game abstract class represents a game and has the following abstract methods that must be implemented by subclasses:

getWordWithBlanks(): returns the word with blanks for unguessed letters
isWon(): returns true if the word has been completely guessed
isLost(): returns true if all lives have been lost

Hangman

The Hangman class extends the Game class and implements the abstract methods to play the game of Hangman.

Player

The Player class represents a player and has a method for reading input from the user.

Main

The Main class is the entry point of the program and contains the main game loop. It creates a WordList object and a Hangman object, and then repeatedly prompts the user for a letter guess until the game is won or lost.

How to Play

To play the game, run the Main class. You will be prompted to enter a letter as a guess. If the letter is in the word, it will be revealed. If the letter is not in the word, you will lose a life. You have a certain number of lives, and if you run out of lives before guessing the word, you lose the game. If you guess all the letters in the word before running out of lives, you win the game.
