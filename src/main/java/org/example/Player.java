package org.example;
import java.util.Scanner;

public class Player {

    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
    }

    public char getGuess() {
        // Ask player for input
        System.out.print("Enter a letter: ");

        // Get the player's input as a string
        String input = scanner.nextLine();

        // Returning the first character as a char
        return input.charAt(0);
    }

    public void printMessage(String message) {
        System.out.println(message);


    }


}
