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

## Download manually

Download the example:

```
mkdir assignment5 && cd assignment5
curl https://codeload.github.com/abranhe/cop3337/tar.gz/master | tar -xz --strip=2 cop3337/assignment5
```

## Build

```
$ javac *.java
```

## Run

```
$ java BalanceTransactions
```