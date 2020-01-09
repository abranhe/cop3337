/**
 * Title: Assignment4 
 * Semester: COP3337 – Fall 2019
 * 
 * @author Carlos Hernandez
 *
 * I affirm that this program is entirely my own work and none of it is
 * the work of any other person.
 *
 * A BaseFormatter formats the number as base n, where n is any number
 * between 2 and 36 that is provided in the constructor.
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