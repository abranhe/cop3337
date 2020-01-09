/**
 * Title: Assignment3 Semester: COP3337 – Fall 2019
 * 
 * @author Carlos Hernandez
 *
 * I affirm that this program is entirely my own work and none of it is
 * the work of any other person.
 *
 * PART II: Provide a subclass of Clock namded WorldClock whose
 * constructor accepts a time offset.
 * 
 * For example, if you live in California, a new WorldClock(3) should
 * show the time in New York, three time zones ahead. You should not
 * override getTime.
 */

public class WorldClock extends Clock {
  /**
   * The value of the offset in hours.
   */
  private int offset = 0;

  /**
   * Adds the offset hours value to the dateTime.
   */
  public WorldClock(int offset) {
     this.offset = offset;
  }

  @Override
  public String getHours() {
     int hour = Integer.parseInt(super.getHours()) + this.offset;

     // Format the output with leading zeros
     return String.format("%02d", hour % 24);
  }
}