package com.abranhe.cop3337.assignment2;

public class RestroomTester {
    public static void main(String[] args) {
        int STALLS = 12;
        Restroom wc = new Restroom(STALLS);
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("______X_____");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("___X__X_____");
    }
}

