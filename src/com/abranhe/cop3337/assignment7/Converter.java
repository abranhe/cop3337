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

package com.abranhe.cop3337.assignment7;

/**
 * I affirm that this program is entirely my own work and none of it is
 * the work of any other person.
 *
 * The class convert an amount of money between U.S. dollars (USD),
 * euros (EUR), and British pounds (GBP).
 * 
 * @author Carlos Hernandez
 */

public class Converter {
  /**
   * Constant convertion 1 EUR is equal to 1.42 USD
   */
  private static final double EUR_TO_USD = 1.42;
  /**
   * Constant convertion 1 GBP is equal to 1.64 USD
   */
  private static final double GBP_TO_USD = 1.64;
  /**
   * Constant convertion 1 GBP is equal to 1.13 EUR
   */
  private static final double GBP_TO_EUR = 1.13;

  /**
   * Returns the value of the amount from one currency to another.
   *
   * @param amount - amount to be converted
   * @param source - source unit (currency)
   * @param target - target unit
   * @return - converted value
   * 
   */
  public static double convert(double amount, Currency source, Currency target) {
    if (source == Currency.USD && target == Currency.EUR) {
      return amount / EUR_TO_USD;
    }

    if (source == Currency.USD && target == Currency.GBP) {
      return amount / GBP_TO_USD;
    }

    if (source == Currency.EUR && target == Currency.USD) {
      return amount * EUR_TO_USD;
    }

    if (source == Currency.EUR && target == Currency.GBP) {
      return amount / GBP_TO_EUR;
    }

    if (source == Currency.GBP && target == Currency.USD) {
      return amount * GBP_TO_USD;
    }

    if (source == Currency.GBP && target == Currency.EUR) {
      return amount * GBP_TO_EUR;
    }

    // If the currency target and currency source are the same
    // return the same amount.
    return amount;

  }

}

/**
 * Java representation of native Currency units enum.
 */

enum Currency {
  USD, EUR, GBP
}