WORDLIST

A class that allows the user to create a list of words and choose a random word from that list. It has two fields: a List called words that will hold the list of words and a Random object called random that will generate a random number. The class has a constructor that initializes these two fields by creating a new ArrayList for the words and a new Random object for the random field. It also has two methods: addWord and getRandomWord. The addWord method allows the user to add a new word to the list of words. The getRandomWord method generates a random number using the random object and uses it as an index to get a random word from the list of words.

GAME

Defining an abstract class called Game which represents a game that consists of guessing a word. The class has three abstract methods: getWordWithBlanks, isWon, and isLost. It also has a constructor that takes in a word and the number of lives as arguments and initializes the word, lives, and lettersGuessed fields. The lettersGuessed field is a list that stores the letters that have been guessed so far.
The guessLetter method takes in a letter as an argument and returns a boolean value indicating whether the guess was correct or not. If the letter has already been guessed, it returns false. Otherwise, it adds the letter to the lettersGuessed list and checks if the letter is present in the word. If it is, it returns true, otherwise it decrements the number of lives and returns false.

HANGMAN

It has a constructor that takes in a word and number of lives as arguments and passes them to the superclass. It also has three methods: getWordWithBlanks, isWon, and isLost.
The getWordWithBlanks method creates a char array with the same length as the word and fills it with underscores. It then replaces each underscore with the corresponding letter in the word if it has been guessed. Finally, it returns the word with blanks as a string.
The isWon method checks if all the letters in the word have been guessed. If any letters have not been guessed, it returns false. Otherwise, it returns true.
The isLost method simply checks if the number of lives is equal to 0 and returns true if it is. Otherwise, it returns false.

PLAYER

The Player class represents a player in a game. It has a private Scanner object called scanner, which is used to get input from the player. The class has a constructor that initializes the scanner to read from the standard input stream. The class has two methods: getGuess and printMessage. The getGuess method prompts the player to enter a letter and returns the first character of the player's input as a char. The printMessage method prints the given message to the standard output stream.


MAIN

This class runs the  game - Hangman. It begins by creating a WordList object and adding several words to it. It then generates a random word from the WordList and creates a Hangman object using that word and setting the number of lives to 3. It also creates a Player object. The game loop continues until either the Hangman object is won or lost. Each iteration of the loop, the player is asked to make a guess and the guess is passed to the Hangman object's guessLetter method. If the guess is correct, the player is told they were correct and if the guess is incorrect, the player is told they were incorrect. The number of lives remaining is checked and the appropriate hangman drawing is printed based on the number of lives. If the game is won, the player is told they won, and if the game is lost, the end of the game is printed with the word that was being guessed.


IMPLEMANTION OF 4 PILLARS OF OOP

1.	Encapsulation: Encapsulation is the practice of hiding the implementation details of a class from the users of that class. In this code, the implementation details of the WordList class, such as how the words list is implemented and how the getRandomWord() method selects a random word, are hidden from the users of the WordList class. This is achieved by making the words field private and not providing a method for users to directly access or modify it.
2.	Abstraction: Abstraction is the process of exposing only the relevant and essential characteristics and behaviors of an object to the users of that object, while hiding the implementation details. The Game class is an abstract class that provides a common interface for different types of games(or Sub-games  based on level of difficulty e.g Medium, Hard), but it does not provide an implementation for the abstract methods getWordWithBlanks(), isWon(), and isLost(). These methods are implemented by concrete subclasses of Game, such as the Hangman class.
3.	Inheritance: Inheritance is the ability of a class to inherit properties and methods from a parent class. The Hangman class inherits fields and methods from the Game class, such as the word, lettersGuessed, and lives fields and the guessLetter() method. This allows the Hangman class to reuse the code in the Game class and customize its behaviour as needed.
4.	Polymorphism: Polymorphism is the ability of an object to take on multiple forms. The Game class is an abstract class that defines an interface for different types of games, but it does not provide an implementation for the abstract methods. This allows concrete subclasses of Game, such as the Hangman class, to provide their own implementations for these methods and behave differently depending on their specific type.


