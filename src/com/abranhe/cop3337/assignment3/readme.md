## Assignment 3

Write a program to implement a class Clock whose getHours and getMinutes methods return the current time at your location. Also include a getTime method that returns a string with the hours and minutes by calling the getHours and getMinutes methods.

Provide a subclass WorldClock whose constructor accepts a time offset. For example, if you live in California, a `new WorldCLock(3)` should show the time in NewYork, three-time zones ahead.

Include an Alarm feature in the Clock class. When `setAlarm(hours, minutes)`, the clock stores the alarm. When you call getTime and the alarm time has been reached or exceeded, return the
time followed by the string `"Alarm"` and clear the alarm.

I have provided a ClockDemo class which can be used to test the program. Do not change it when you submit it. I provided a Clock class which has shells for all the methods which you should fill in. The same applies to the WorldClock class.

## Download manually

Download the example:

```
mkdir assignment3 && cd assignment3
curl https://codeload.github.com/abranhe/cop3337/tar.gz/master | tar -xz --strip=2 cop3337/assignment3
```

## Build

```
$ javac *.java
```

## Run

```
$ java ClockDemo
```