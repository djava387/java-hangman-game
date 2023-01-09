package org.example;
import java.util.Scanner;

// Player class for a simple text-based game
public class Player {
    // Scanner object to read input from the user
    private Scanner scanner;

    // Constructor initializes the scanner object
    public Player() {
        scanner = new Scanner(System.in);
    }

    // Prompts the user to enter their name and returns it
    public String getName() {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    // Prompts the user to enter a letter and returns it
    public char getGuess() {
        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();
        return input.charAt(0);
    }

    // Prompts the user if they want to play again and returns their response as a boolean value
    public boolean wantsToPlayAgain() {
        // Continuously prompts the user until they enter a valid response
        while (true) {
            System.out.print("Do you want to play again? (Y/N) ");
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("Y")) {
                return true;
            } else if (input.equals("N")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

}