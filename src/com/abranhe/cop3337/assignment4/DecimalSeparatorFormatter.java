/**
 * Title: Assignment4 
 * Semester: COP3337 – Fall 2019
 * 
 * @author Carlos Hernandez
 *
 * I affirm that this program is entirely my own work and none of it is
 * the work of any other person.
 *
 * A DecimalSeparatorFormatter formats an integer with decimal
 * separators.
 * 
 * For example, one million as 1,000,000.
 */

public class DecimalSeparatorFormatter implements NumberFormatter {

  /**
   * Formats an integer with decimal separators.
   * 
   * @param n interger to format.
   * @return the value of the integer as a string with decimal separators.
   */
  public String format(int n) {
    return String.format("%,d", n);
  }
}