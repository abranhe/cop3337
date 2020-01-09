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

package com.abranhe.cop3337.assignment5;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * The Program calculate if the actual amount of cash at the end
 * of the day from a file is equals to the expected value entered 
 * by the user.
 * 
 * @author Carlos Hernandez
 */

public class BalanceTransactions {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    FileReader fr = null;
    BufferedReader br = null;
    boolean invalidFilename = false;

    // Read the initial amount.
    double begin = Double.parseDouble(getUserInput("Enter the amount at begining of day: ", sc));

    // Read the amount at the end of day.
    double end = Double.parseDouble(getUserInput("Enter the amount at end of day: ", sc));

    do {
      // Read the file name.
      String file = getUserInput("Enter the name of file (Example transactions.txt): ", sc);

      try {
        String currentLine = "";
        fr = new FileReader(file);
        br = new BufferedReader(fr);
        invalidFilename = false;

        while ((currentLine = br.readLine()) != null) {
          // Split the line by spaces, optaining an array like this:
          // 0 - invoice number
          // 1 - the cash amount
          // 2 - P if amount paid, R if amount received
          String[] input = currentLine.split("[\\s']");

          // If amount is paid, we substact the paid amount
          // from the initial amout.
          if (input[2].equals("P")) {
            begin -= Double.parseDouble(input[1]);

          // Otherwise if the amount is received, we add
          // the received amount to the initial amount.
          } else if (input[2].equals("R")) {
            begin += Double.parseDouble(input[1]);
          }
        }

      } catch (IOException e) {
        System.out.println("Invalid filename! Try Again.");
        // If an error happend reading the file, it sets to true the
        // invalidFilename flag, so the program keeps asking the user
        // for a valid input.
        invalidFilename = true;
      }
    } while (invalidFilename);

    sc.close();

    // Verify if the amount from the file matches the amount entered by the user.
    String matchesData = begin == end ? "is matching" : "is not matching";

    System.out.println("\nYour data " + matchesData + " with the input.");
  }

  /**
   * A helper method that displays a message to the user and then returns the
   * output of the user.
   * 
   * @param message message to display to the user.
   * @param scan    instance of the scanner.
   * @return an string with the value of the user.
   */
  private static String getUserInput(String message, Scanner scan) {
    System.out.print(message);

    return scan.next();
  }
}