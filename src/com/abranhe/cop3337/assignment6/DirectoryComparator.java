import java.util.Comparator;

/**
 * Title: Assignment6
 * Semester: COP3337 – Fall 2019
 * 
 * @author Carlos Hernandez
 *
 * I affirm that this program is entirely my own work and none of it is
 * the work of any other person.
 *
 * A comparator that compares strings that end in digit sequences in a way
 * that makes sense to a human. First compare the part before the digit as
 * strings, and then compare the numeric values of the digits.
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