## Assignment 10

This is an additional assignment from the chapter on the Java Collections Framework.

Suppose you buy 100 shares of a stock at $12 per share, then another 100 at $10 per share, then you
sell 150 shares at $15. You have to pay taxes on the gain, but exactly what is the gain? In the United
States, the FIFO rule holds: You first sell all shares of the first batch for a profit of $300, then 50 of the
shares from the second batch, for a profit of $250, yielding a total profit of $550. 

Write a program that can make these calculations for arbitrary purchases and sales of shares in a portfolio. The user enters commands buy symbol quantity price, sell symbol quantity price (which causes the gain on that
transaction to be displayed), and quit. 

Hint: Keep a `Map<String, Queue<Block>>` that manages a separate queue for each stock symbol.

Use the included templates for the program in the included zip file. You do not need to add any additional methods other than what are included. There is a sample of an input script so you can see how I may test your program. Be sure to fully test the program before submitting it. I should not be able to crash it.


## Download manually

Download the example:

```
mkdir assignment10 && cd assignment10
curl https://codeload.github.com/abranhe/cop3337/tar.gz/master | tar -xz --strip=2 cop3337/assignment10
```

## Build

```
$ javac *.java
```

## Run

```
$ java SimulationRunner
```