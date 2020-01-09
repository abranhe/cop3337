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

## Download manually

Download the example:

```
mkdir assignment1 && cd assignment1
curl https://codeload.github.com/abranhe/cop3337/tar.gz/master | tar -xz --strip=2 cop3337/assignment1
```

## Build

```
$ javac *.java
```

## Run

```
$ java DiceOddsTester
```