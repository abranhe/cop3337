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

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;

/**
 * The Clock Class.
 * 
 * @author Carlos Abraham Hernandez
 */

public class Clock {
    /**
     * The constant for the Hours.
     */
    private final String HOURS = "hours";
    /**
     * The constant for the Minutes.
     */
    private final String MINUTES = "minutes";
    /**
     * Hashmap that represent the alarm. If the alarm is off the value of the hours or
     * minutes is -1.
     */
    private HashMap<String, Integer> alarm = new HashMap<>();

    /**
     * Sets up the alarm minutes and hours default to -1.
     */
    public Clock() {
        this.alarm.put(HOURS, -1);
        this.alarm.put(MINUTES, -1);
    }

    /**
     * Sets the alarm.
     *
     * @param hours   hours for alarm
     * @param minutes minutes for alarm
     */
    public void setAlarm(int hours, int minutes) {
        this.alarm.put(HOURS, hours);
        this.alarm.put(MINUTES, minutes);
    }

    /**
     * Gets current time composed of hours and minutes.
     *
     * @return time in string
     */
    public String getTime() {
        String time = this.getHours() + ":" + this.getMinutes();

        if (this.shouldDisplayAlarm()) {
            this.clearAlarm();
            return time + " Alarm";
        }

        return time;
    }

    /**
     * Get hours.
     *
     * @return hours of current time in string
     */
    public String getHours() {
        return this.parseTime()[0];
    }

    /**
     * Get minutes.
     *
     * @return hours of current time in string.
     */
    public String getMinutes() {
        return this.parseTime()[1];
    }

    /**
     * Helper method to check if the alarm should be displayed.
     */
    private Boolean shouldDisplayAlarm() {
        Boolean isAlarmSet = this.alarm.get(HOURS) != -1;
        Boolean hoursReached = Integer.parseInt(this.getHours()) >= this.alarm.get(HOURS);
        Boolean minsReached = Integer.parseInt(this.getMinutes()) >= this.alarm.get(MINUTES);

        return isAlarmSet && hoursReached && minsReached;
    }

    /**
     * Helper method to clear the values of the hours and minutes in the alarm.
     */
    private void clearAlarm() {
        this.alarm.put(HOURS, -1);
        this.alarm.put(MINUTES, -1);
    }

    /**
     * Parse date time and returns the values of the hours and minutes into an
     * array. The first index of the array (0) is the hours and the second index in
     * the array (1) is the value of the minutes.
     *
     * @return an array with the values of the minutes and hours.
     */
    private String[] parseTime() {
        // Split the time string using a regular expression "T".
        //
        // Example:
        // "2019-09-19T06:53:55.626268" => ["2019-09-19", "06:53:55.626268"]
        //
        // Then storing the 5 first characters starting from 0 into the time variable.
        // => "06:53"
        String time = this.currentTime().split("T")[1].substring(0, 5);

        // Getting hours out of "06:53:55.626268" => "06"
        String hours = time.substring(0, 2);

        // Getting minutes out of "06:53:55.626268" => "53"
        String minutes = time.substring(3, 5);

        return new String[] { hours, minutes };
    }

    /**
     * Returns the current Date and Time as a String.
     */
    private String currentTime() {
        return LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).toString();
    }
}
