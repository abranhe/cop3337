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

## Download manually

Download the example:

```
mkdir assignment4 && cd assignment4
curl https://codeload.github.com/abranhe/cop3337/tar.gz/master | tar -xz --strip=2 cop3337/assignment4
```

## Build

```
$ javac *.java
```

## Run

```
$ java NumberFormatterTester
```