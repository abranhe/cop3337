## Assignment 7

Write a program with a graphical interface that allows the user to convert an amount of money between U.S. dollars (USD), euros (EUR), and British pounds (GBP). The user interface should have the following elements: a text box to enter the amount to be converted, two combo boxes to allow the user to select the currencies, a button to make the conversion, and a label to show
the result. Display a warning if the user does not choose different currencies. Use the following conversion rates:

- 1 EUR is equal to 1.42 USD.
- 1 GBP is equal to 1.64 USD.
- 1 GBP is equal to 1.13 EUR.

It is the programmer’s responsibility to ensure that no matter what the user enters, the program does not crash.

Call the main program `Converter.java`. You will need another class for the frame.

## Download manually

Download the example:

```
mkdir assignment7 && cd assignment7
curl https://codeload.github.com/abranhe/cop3337/tar.gz/master | tar -xz --strip=2 cop3337/assignment7
```

## Build

```
$ javac *.java
```

## Run

```
$ java App
```