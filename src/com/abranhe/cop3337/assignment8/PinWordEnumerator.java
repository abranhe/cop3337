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

package com.abranhe.cop3337.assignment8;

import java.util.Scanner;

/**
 * Converts a numeric pin to an equivalent word using the digit to letter
 * mapping on a standard telephone keypad.
 * 
 * @author Carlos Hernandez
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