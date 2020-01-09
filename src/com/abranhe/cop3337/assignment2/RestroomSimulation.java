package com.abranhe.cop3337.assignment2;

import java.util.Scanner;
import java.io.PrintStream;

public class RestroomSimulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintStream p = new PrintStream(System.out);

        final int stallsRange[] = { 5, 30 };
        int peopleRange[] = { 0, 30 };

        int numberOfStalls = 0;
        int numberOfPeople = 0;

        numberOfStalls = getUserInput("Please enter the number of stalls in the restroom (Between 5-30): ", stallsRange, sc);

        peopleRange[1] = numberOfStalls;

        numberOfPeople = getUserInput("How many people have entered the restroom? (0-" + numberOfStalls + "): ", peopleRange, sc);

        sc.close();

        Restroom restroom = new Restroom(numberOfStalls);

        for (int i = 0; i < numberOfPeople; i++) {
            restroom.addOccupant();
        }

        p.println(restroom.getStalls());
    }

    /**
     * Helper method to scan the user input, validate the input
     * and returns the value of the input.
     *
     * @param message the message to display
     * @param range range of the values to validate
     * @param scanner instance of the scanner
     */
    public static int getUserInput(String message, int[] range, Scanner scanner) {
        PrintStream p = new PrintStream(System.out);
        int input = 0;

        do {
            p.println(message);

            while (!scanner.hasNextInt()) {
                p.println("Invalid input!");
                scanner.next();
            }

            input = scanner.nextInt();

        } while (input < range[0] || input > range[1]);

        return input;
    }
}

