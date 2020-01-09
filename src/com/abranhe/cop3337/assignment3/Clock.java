package com.abranhe.cop3337.assignment3;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;

/**
 * Title: Assignment3 Semester: COP3337 – Fall 2019
 *
 * @author Carlos Hernandez
 *
 * I affirm that this program is entirely my own work and none of it is
 * the work of any other person.
 *
 * Part I: Implement a class Clock whose getHours, getMinutes and
 * getTime methods return the current time at your location. Return the
 * time as a string.
 *
 * There are two ways to retrieve the current time as a String:
 *
 * 1) Before Java 8 use new Date().toString() 2) With Java 8, you can
 * use 3 classes in the java.time package: Instant, LocalDateTime and
 * ZoneId.
 *
 * Here's how you do it: String timeString =
 * LocalDateTime.ofInstant(Instant.now(),
 * ZoneId.systemDefault()).toString()
 *
 * With either method, you'll need to extract the hours and minutes as a
 * substring.
 *
 * Add an alarm feature to the Clock class. When setAlarm(hours,
 * minutes) is called, the clock stores the alarm. When you call
 * getTime, and the alarm time has been reached or exceeded, return the
 * time followed by the string "Alarm" and clear the alarm.
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
