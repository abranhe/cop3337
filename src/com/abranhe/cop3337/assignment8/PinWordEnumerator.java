import java.util.Scanner;

/**
 * Title: Assignment8
 * Semester: COP3337 – Fall 2019
 * 
 * @author Carlos Hernandez
 *
 * I affirm that this program is entirely my own work and none of it is
 * the work of any other person.
 *
 * Converts a numeric pin to an equivalent word using the digit to letter
 * mapping on a standard telephone keypad.
 */

public class PinWordEnumerator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a pin number-> ");
    String num = scan.nextLine();
    System.out.println();
    System.out.printf("The keypad encodings for %s are:%n", num);
    enumerateWords(num);
    scan.close();
  }

  /**
   * A wrapper for a recursive method that enumerates all the phone keypad
   * encodings for a number.
   * 
   * @param pin a string representing the pin.
   */

  public static void enumerateWords(String pin) {
    // Validate that numbers are from 2-9 only.
    if (pin != null && !pin.contains("0") && !pin.contains("1")) {
      enumerateWords(pin, new String());
    } else {
      System.out.println("Sorry the pin is not valid. Valid pin numbers are 2-9.");
    }
  }

  /**
   * The recursive method that prints the equivalent word using the digit to
   * letter mapping on a standard telephone keypad.
   * 
   * @param num  current number
   * @param text text containing converted spellings
   */

  public static void enumerateWords(String pin, String text) {
    if (pin.length() == 0) {
      // When the pin length is 0
      System.out.println(text);
    } else {
      // Find the digit at the position 0, then
      // store the possible phone letters.
      char letters[] = keysFromPhoneNumber(pin.charAt(0) - '0');

      if (letters != null) {
        // Iterate over the posssible words
        for (int i = 0; i < letters.length; i++) {
          enumerateWords(pin.substring(1), text + letters[i]);
        }
      }
    }
  }

  /**
   * Returns an array containing the charaters corresponding to the numbers in the
   * phone.
   * 
   * @param number a number from the phone.
   */

  public static char[] keysFromPhoneNumber(int number) {
    switch (number) {
    case 2:
      return new char[] { 'A', 'B', 'C' };
    case 3:
      return new char[] { 'D', 'E', 'F' };
    case 4:
      return new char[] { 'G', 'H', 'I' };
    case 5:
      return new char[] { 'J', 'K', 'L' };
    case 6:
      return new char[] { 'M', 'N', 'O' };
    case 7:
      return new char[] { 'P', 'Q', 'R', 'S' };
    case 8:
      return new char[] { 'T', 'U', 'V' };
    case 9:
      return new char[] { 'W', 'X', 'Y', 'Z' };
    }
    return null;
  }
}