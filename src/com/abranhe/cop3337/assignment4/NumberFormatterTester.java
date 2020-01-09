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

package com.abranhe.cop3337.assignment4;

/**
 * Class to test the format method from classes that implement the
 * NumberFormatter interface.
 */

public class NumberFormatterTester {
      public static void main(String[] args) {
            final int small = 5;
            final int neg = -10000;
            final int large = 1000000;
            final int maxBase = 36;
            NumberFormatter numFormat;

            numFormat = new DefaultFormatter();
            System.out.println("Default:  " + numFormat.format(small) + " " + numFormat.format(neg) + " "
                        + numFormat.format(large) + " " + numFormat.format(maxBase));
            System.out.println("Expected: 5 -10000 1000000 36");

            numFormat = new DecimalSeparatorFormatter();
            System.out.println("Decimal:  " + numFormat.format(small) + " " + numFormat.format(neg) + " "
                        + numFormat.format(large) + " " + numFormat.format(maxBase));
            System.out.println("Expected: 5 -10,000 1,000,000 36");

            numFormat = new AccountingFormatter();
            System.out.println("Accounting: " + numFormat.format(small) + " " + numFormat.format(neg) + " "
                        + numFormat.format(large) + " " + numFormat.format(maxBase));
            System.out.println("Expected:   5 (10000) 1000000 36");

            numFormat = new BaseFormatter(2); // Binary System
            System.out.println("Base 2  : " + numFormat.format(small) + " " + numFormat.format(neg) + " "
                        + numFormat.format(large) + " " + numFormat.format(maxBase));
            System.out.println("Expected: 101 -10011100010000 11110100001001000000 100100");

            numFormat = new BaseFormatter(8); // Octal System
            System.out.println("Base 8  : " + numFormat.format(small) + " " + numFormat.format(neg) + " "
                        + numFormat.format(large) + " " + numFormat.format(maxBase));
            System.out.println("Expected: 5 -23420 3641100 44");

            numFormat = new BaseFormatter(20); // Base 20
            System.out.println("Base 20 : " + numFormat.format(small) + " " + numFormat.format(neg) + " "
                        + numFormat.format(large) + " " + numFormat.format(maxBase));
            System.out.println("Expected: 5 -1500 65000 1g");

            numFormat = new BaseFormatter(36); // Base 36
            System.out.println("Base 36 : " + numFormat.format(small) + " " + numFormat.format(neg) + " "
                        + numFormat.format(large) + " " + numFormat.format(maxBase));
            System.out.println("Expected: 5 -7ps lfls 10");
      }
}
