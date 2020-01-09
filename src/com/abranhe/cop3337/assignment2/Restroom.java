package com.abranhe.cop3337.assignment2;

/**
 * A class that shows how restroom stalls are occupied.
 *
 * @author Carlos Abraham Hernandez
 */
public class Restroom {
    private boolean[] restroomStalls;
    private int numberOfStalls = 0;

    /**
     * Constructs a restroom with a given number of stalls.
     *
     * @param numberOfStalls the number of stalls
     */
    public Restroom(int numberOfStalls) {
        this.restroomStalls = new boolean[numberOfStalls];
        this.numberOfStalls = numberOfStalls;
    }

    /**
     * Adds an occupant in the middle of the longest sequence of unoccupied places.
     */
    public void addOccupant() {
        int occupiedStalls = 0, avilableStalls = 0, secondLargest = 0, largestUnoccupied = 0;

        for (int i = 0; i <= this.numberOfStalls; i++) {
            if (this.numberOfStalls == i) {

                if (secondLargest > largestUnoccupied) {
                    largestUnoccupied = secondLargest;
                    avilableStalls = occupiedStalls;
                }

            } else if (secondLargest == 0 && !this.restroomStalls[i]) {

                occupiedStalls = i;
                secondLargest++;

            } else {

                if (this.restroomStalls[i]) {
                    if (secondLargest > largestUnoccupied) {
                        largestUnoccupied = secondLargest;
                        avilableStalls = occupiedStalls;
                    }
                    secondLargest = 0;

                } else {
                    secondLargest++;
                }
            }
        }

        this.fillPerson(largestUnoccupied / 2 + avilableStalls);
    }

    /**
     * Fills the restroom stall of a person from a given index.
     *
     * @param indexPosition the position of the person to fill.
     */
    private void fillPerson(int indexPosition) {
        this.restroomStalls[indexPosition] = true;
    }

    /**
     * Gets a string describing the current stall occupation
     *
     * @return a string with _ for an empty stall and X for an occupied one
     */
    public String getStalls() {
        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";

        String diagram = "";

        for (boolean stall : this.restroomStalls) {
            diagram += stall ? RED + "X" + RESET : GREEN + "_" + RESET;
        }

        return diagram;
    }
}