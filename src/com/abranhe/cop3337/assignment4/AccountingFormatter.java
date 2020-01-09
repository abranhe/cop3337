/**
 * Title: Assignment4 
 * Semester: COP3337 – Fall 2019
 * 
 * @author Carlos Hernandez
 *
 * I affirm that this program is entirely my own work and none of it is
 * the work of any other person.
 *
 * An AccountingFormatter formats negative numbers with parenthesis.
 * 
 * For example, -1 as (1).
 */

public class AccountingFormatter implements NumberFormatter {
  
  /**
   * Reuse the regular formatter.
   */
  DefaultFormatter defaultFormatter = new DefaultFormatter();

  /**
   * Formats negative numbers with parenthesis.
   * 
   * @param n interger to format.
   * @return the value of the negative numbers as a string with parentisis.
   */
  public String format(int n) {
    return n < 0 ? String.format("(%d)", Math.abs(n)) : defaultFormatter.format(n);
  }
}