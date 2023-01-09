package org.example;
import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
    }

    public String getName() {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public char getGuess() {
        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();
        return input.charAt(0);
    }

    public boolean wantsToPlayAgain() {
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