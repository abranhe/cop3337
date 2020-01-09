<div align="center">
  <br />
  <br />
  <a href="https://p.abranhe.com/cop3337">
    <img src="https://cdn.abranhe.com/projects/cop3337/logo.png">
  </a>
  <br />
  <br />
</div>

Here is the source code of some of the projects that I took while taking the Programming 2 (COP3337) at [Florida International University](https://fiu.edu).

If you copy and paste the code from the repo you are responsible for what could happen to you. **USE AT YOUR OWN RISK**. Many assignments may be wrong according to your teacher.

## Assignments

Questions:

- Assignment 1 - [Question](#assignment1) - [Answer](#assignment1)
- Assignment 2 - [Question](#assignment2) - [Answer](#assignment2)
- Assignment 3 - [Question](#assignment3) - [Answer](#assignment3)
- Assignment 4 - [Question](#assignment4) - [Answer](#assignment4)
- Assignment 5 - [Question](#assignment5) - [Answer](#assignment5)
- Assignment 6 - [Question](#assignment6) - [Answer](#assignment6)
- Assignment 7 - [Question](#assignment7) - [Answer](#assignment7)
- Assignment 8 - [Question](#assignment8) - [Answer](#assignment8)
- Assignment 9 - [Question](#assignment9) - [Answer](#assignment9)
- Assignment 10 - [Question](#assignment10) - [Answer](#assignment10)
- [Related](#related)
- [License](license)


## Assignment 1

In the 17th century, the discipline of probability theory got its start when a gambler asked a
mathematician friend to explain some observations about dice games. Why did he, on average,
lose a bet that at least one six would appear when rolling a die four times? And why did he
seem to win a similar bet, getting at least one double six when rolling a pair of dice 24 times?

Nowadays, it seems astounding that any person would roll a pair of dice 24 times in a row, and
then repeat that many times over. Let’s do that experiment on a computer instead. Simulate
each game a million times and print out the wins and losses.

Use the files in the zip file for Assignment 1 as a starting point.

 - There is a Die class which simulates the throw of a die.
 - There is a Die Odds Tester class which you should use as a test program to show your
program working.
 - The GameSimulator class is where you write your code. Please fill in all the code where
it is indicated.

## Assignment 2

It is a well-researched fact that men in a restroom generally prefer to maximize their distance
from already occupied stalls, by occupying the middle of the longest sequence of unoccupied
places.

For example, consider the situation where ten stalls are empty.

```
_ _ _ _ _ _ _ _ _ _
```

The first visitor will occupy a middle position:

```
_ _ _ _ _ X _ _ _ _
```

The next visitor will be in the middle of the empty area at the left.

```
_ _ X _ _ X _ _ _ _
```

Write a program that reads the number of the stalls from the user in the
RestroomSimulation.java file and then prints out the diagrams in the format given above when
the stalls become filled, one at a time. Hint: Use an array of boolean values to indicate whether
a stall is occupied. The user should enter a number between 5 and 30 for the number of stalls.
The number should be validated to be within that range. The rest of the code will be written in
the Restroom.java file.

There are two other test programs that you can use to test your program included in the zip
file. They are the ones call Restroom Tester.java and RestroomTester2.java.

## Assignment 3

Write a program to implement a class Clock whose getHours and getMinutes methods return the current time at your location. Also include a getTime method that returns a string with the hours and minutes by calling the getHours and getMinutes methods.

Provide a subclass WorldClock whose constructor accepts a time offset. For example, if you live in California, a `new WorldCLock(3)` should show the time in NewYork, three-time zones ahead.

Include an Alarm feature in the Clock class. When `setAlarm(hours, minutes)`, the clock stores the alarm. When you call getTime and the alarm time has been reached or exceeded, return the
time followed by the string `"Alarm"` and clear the alarm.

I have provided a ClockDemo class which can be used to test the program. Do not change it when you submit it. I provided a Clock class which has shells for all the methods which you should fill in. The same applies to the WorldClock class.

## Assignment 4

Consider an interface

```java
public interface NumberFormatter {
    String format (int n);
}
```

Provide four additional classes that implement this interface.

 - A DefaultFormatter formats an integer in the usual way.
 - A DecimalSeparatorFormatter formats an integer with decimal separators; for example,
one million as 1,000,000.
 - An AccountingFormatter formats negative numbers with parenthesis; for example, -1 as
(1).
 - A BaseFormatter formats the number as base n, where n is any number between 2 and
36 that is provided in the constructor.

I have provided the test class which should be included in the submission. It is called NumberFormatterTester.java. Please do not change this class.

## Assignment 5

A store owner keeps a record of daily transactions in a text file. Each line contains three items: The invoice number, the cash amount, and the letter P if the amount was paid or R if the amount was received. Items on each line are separated by spaces. Write a program that
prompts the store owner for the amount of cash at the beginning of the day and for the amount of cash at the end of the day, as well as the name of the ledger text file. 

Your program should calculate if the actual amount of cash at the end of the day equals the expected value. If an error is found while reading the text file, the user should be allowed to choose another file.

Call your program BalanceTransactions.java.

Use a `transactions.txt` file with the following lines:

```
10001 56.67 P
10002 23.67 R
10003 99.50 R
10004 10.95 P
```

## Assignment 6

It is common for people to name directories as dir1, dir2, and so on. When there are ten or more directories, the operating system displays them in dictionary order, as dir1, dir10, dir11, dir12, dir2, dir3, and so on. That is irritating, and it is easy to fix. Provide a comparator that compares strings that end in digit sequences in a way that makes sense to a human. First compare the part before the digit as strings, and then compare the numeric values of the digits.

Your program should work with the provided test program.

Call the class you write DirectoryComparator.java.

## Assignment 7

Write a program with a graphical interface that allows the user to convert an amount of money between U.S. dollars (USD), euros (EUR), and British pounds (GBP). The user interface should have the following elements: a text box to enter the amount to be converted, two combo boxes to allow the user to select the currencies, a button to make the conversion, and a label to show
the result. Display a warning if the user does not choose different currencies. Use the following conversion rates:

- 1 EUR is equal to 1.42 USD.
- 1 GBP is equal to 1.64 USD.
- 1 GBP is equal to 1.13 EUR.

It is the programmer’s responsibility to ensure that no matter what the user enters, the program does not crash.

Call the main program `Converter.java`. You will need another class for the frame.

## Assignment 8

Phone numbers and PIN codes can be easier to remember when you find words that spell out the number on a standard phone pad. For example, instead of remembering the combination `5282`, you can just think of JAVA.

Write a recursive method that given a number, yields all possible spellings (which may or may not be real words).

Please use the file included as a starting point.

Possible testing values are:

```
5282
26678837
7764726
```

## Assignment 9

Using the attached files, `Term.java`, `Polynomial.java`, and `PolynomialTester.java` as starting points, write a class Polynomial that stores a polynomial such as:

**p(x) = 5x^10 + 9x^7 – x - 10**

as a linked list of terms. A term contains the coefficient and the power of x. For example, you would store p(x) as

**(5,10),(9,7),(-1,1),(-10,0)**

Supply methods to add, multiply, and print polynomials. Supply a constructor that makes a polynomial from a single term. For example, the polynomial p can be constructed as:

```java
Polynomial p = new Polynomial(new Term(-10, 0));

p.add(new Polynomial(new Term(-1, 1));
p.add(new Polynomial(new Term(9, 7));
p.add(new Polynomial(new Term(5, 10));
```

Then compute p(x) x p(x):

```java
Polynomial q = p.multiply(p);
q.print();
```

## Assignment 10

This is an additional assignment from the chapter on the Java Collections Framework.

Suppose you buy 100 shares of a stock at $12 per share, then another 100 at $10 per share, then you
sell 150 shares at $15. You have to pay taxes on the gain, but exactly what is the gain? In the United
States, the FIFO rule holds: You first sell all shares of the first batch for a profit of $300, then 50 of the
shares from the second batch, for a profit of $250, yielding a total profit of $550. 

Write a program that can make these calculations for arbitrary purchases and sales of shares in a portfolio. The user enters commands buy symbol quantity price, sell symbol quantity price (which causes the gain on that
transaction to be displayed), and quit. 

Hint: Keep a `Map<String, Queue<Block>>` that manages a separate queue for each stock symbol.

Use the included templates for the program in the included zip file. You do not need to add any additional methods other than what are included. There is a sample of an input script so you can see how I may test your program. Be sure to fully test the program before submitting it. I should not be able
to crash it.

## Related

- [cop1334](https://github.com/abranhe/cop1334)
- [cop2800](https://github.com/abranhe/cop2800)
- [cop2805](https://github.com/abranhe/cop2805)
- [cda3103](https://github.com/abranhe/cda3103)

## License

This project is released under [The Unlicense](https://github.com/abranhe/cop3337/tree/master/license).