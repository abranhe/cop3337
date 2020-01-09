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
 * A BaseFormatter formats the number as base n, where n is any number
 * between 2 and 36 that is provided in the constructor.
 * 
 * @author Carlos Hernandez
 */

public class BaseFormatter implements NumberFormatter {
  /**
   * Base formatter field.
   */
  private int base;

  /**
   * Formats a number as a base of n.
   * @param base the value of the base
   */
  public BaseFormatter(int base) {
    this.base = base;

    if (base < 2 || base > 36) {
      this.base = 2;
    }
  }

  /**
   * Formats the number as base n.
   * 
   * @param n interger to format.
   * @return the value of the number as base n.
   */
  public String format(int n) {
    return Integer.toString(n, this.base);
  }
}