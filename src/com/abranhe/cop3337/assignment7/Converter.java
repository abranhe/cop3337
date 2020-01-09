/**
 * Title: Assignment7 
 * Semester: COP3337 – Fall 2019
 * 
 * @author Carlos Hernandez
 *
 * I affirm that this program is entirely my own work and none of it is
 * the work of any other person.
 *
 * The class convert an amount of money between U.S. dollars (USD),
 * euros (EUR), and British pounds (GBP).
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