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

package com.abranhe.cop3337.assignment6;

import java.util.Comparator;

/**
 * A comparator that compares strings that end in digit sequences in a way
 * that makes sense to a human. First compare the part before the digit as
 * strings, and then compare the numeric values of the digits.
 * 
 * @author Carlos Hernandez
 */

public class DirectoryComparator implements Comparator<String> {
  /**
   * Compares its two arguments for order.  Returns a negative integer,
   * zero, or a positive integer as the first argument is less than, equal
   * to, or greater than the second.
   * 
   * @param str1 the first string to be compared.
   * @param str2 the second string to be compared.
   */
  @Override
  public int compare(String str1, String str2) {
    int index = 0;

    for (int i = str1.length() - 1; i >= 0; --i) {
      if (!Character.isDigit(str1.charAt(i)) && index == 0) {
        index = i + 1;
      }
    }

    int n1 = Integer.parseInt(str1.substring(index));
    String w1 = str1.substring(0, index);

    index = 0;

    for (int i = str2.length() - 1; i >= 0; --i) {
      if (!Character.isDigit(str2.charAt(i)) && index == 0) {
        index = i + 1;
      }
    }

    int n2 = Integer.parseInt(str2.substring(index));
    String w2 = str2.substring(0, index);

    return w1.compareTo(w2) == 0 ? Integer.compare(n1, n2) : w1.compareTo(w2);
  }
}