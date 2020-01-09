import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * Title: Assignment5
 * Semester: COP3337 – Fall 2019
 * 
 * @author Carlos Hernandez
 *
 * I affirm that this program is entirely my own work and none of it is
 * the work of any other person.
 * 
 * The Program calculate if the actual amount of cash at the end
 * of the day from a file is equals to the expected value entered 
 * by the user.
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