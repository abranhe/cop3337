/**
 * Title: Assignment4 
 * Semester: COP3337 – Fall 2019
 * 
 * @author Carlos Hernandez
 *
 * I affirm that this program is entirely my own work and none of it is
 * the work of any other person.
 *
 * A DefaultFormatter formats an integer in the usual way.
 */

 class DefaultFormatter implements NumberFormatter {

    /**
     * Formats a simple integer.
     * 
     * @param n interger to format.
     * @return the value of the integer as a string.
     */
    public String format(int n) {
      return String.valueOf(n);
    }
 }