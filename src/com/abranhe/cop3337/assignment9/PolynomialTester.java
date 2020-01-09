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

package com.abranhe.cop3337.assignment9;
/**
 * A class to to test the Polynomial class.
 */
public class PolynomialTester {
   public static void main(String[] args) {
      Polynomial p = new Polynomial(new Term(-10, 0));
      p.print();
      System.out.println("\nExpected: - 10.0");
      p.add(new Polynomial(new Term(-1, 1)));
      p.print();
      System.out.println("\nExpected: - 1.0x - 10.0");
      p.add(new Polynomial(new Term(9, 7)));
      p.print();
      System.out.println("\nExpected: 9.0x^7 - 1.0x - 10.0");
      p.add(new Polynomial(new Term(5, 10)));
      p.print();
      System.out.println("\nExpected: 5.0x^10 + 9.0x^7 - 1.0x - 10.0");

      Polynomial q = p.multiply(p);
      q.print();
      System.out.println("\nExpected: 25.0x^20 + 90.0x^17 + 81.0x^14 - 10.0x^11 - 100.0x^10 - 18.0x^8 - 180.0x^7 + 1.0x^2 + 20.0x + 100.0");
   }
}

// 25.0x^20 + 90.0x^17 - 10.0x^11 - 100.0x^10 + 81.0x^14 - 18.0x^8 - 180.0x^7 + 1.0x^2 + 20.0x + 100.0 -> Expected.
// 25.0x^20 + 90.0x^17 + 81.0x^14 - 10.0x^11 - 100.0x^10 - 18.0x^8 - 180.0x^7 + 1.0x^2 + 20.0x + 100.0