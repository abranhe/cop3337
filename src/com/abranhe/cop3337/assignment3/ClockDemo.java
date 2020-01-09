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

package com.abranhe.cop3337.assignment3;

/**
 * Tests the alarm feature of the Clock class.
 */
public class ClockDemo {
  public static void main(String[] args) {
     // Test WorldClock.
     System.out.println("");
     System.out.println("Testing WorldClock class");
     int offset = 3;
     System.out.println("Offset: " + offset);
     WorldClock wclock = new WorldClock(offset);
     System.out.println("Hours: " + wclock.getHours());
     System.out.println("Minutes: " + wclock.getMinutes());
     System.out.println("Time: " + wclock.getTime());

     // Test the AlarmClock.
     System.out.println("");
     System.out.println("Testing AlarmClock");
     Clock clock = new Clock();
     System.out.println("Hours: " + clock.getHours());
     System.out.println("Minutes: " + clock.getMinutes());
     System.out.println("Time: " + clock.getTime());

     // Test AlarmClock with alarm.
     int h = Integer.parseInt(clock.getHours());
     int m = Integer.parseInt(clock.getMinutes());

     clock.setAlarm(h, m - 1);
     System.out.println("Time: " + clock.getTime());
     // Test to see if the Alarm is cleared.
     System.out.println("Time: " + clock.getTime());
  }
}
