/**
 * This is free and unencumbered software released into the public domain.
 * <p>
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 * <p>
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 * <p>
 * For more information, please refer to <http://unlicense.org>
 */

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

