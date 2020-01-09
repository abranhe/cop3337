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

## Download manually

Download the example:

```
mkdir assignment9 && cd assignment9
curl https://codeload.github.com/abranhe/cop3337/tar.gz/master | tar -xz --strip=2 cop3337/assignment9
```

## Build

```
$ javac *.java
```

## Run

```
$ java PolynomialTester
```