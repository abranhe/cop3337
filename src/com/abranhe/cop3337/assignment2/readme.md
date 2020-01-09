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

## Download manually

Download the example:

```
mkdir assignment2 && cd assignment2
curl https://codeload.github.com/abranhe/cop3337/tar.gz/master | tar -xz --strip=2 cop3337/assignment2
```

## Build

```
$ javac *.java
```

## Run

```
$ java RestroomTester1
```