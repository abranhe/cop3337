package com.abranhe.cop3337.assignment2;

public class RestroomTester1 {
    public static void main(String[] args) {
        int STALLS = 12;
        Restroom wc = new Restroom(STALLS);
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("______X_____");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("___X__X_____");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("___X__X__X__");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("_X_X__X__X__");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("_X_X_XX__X__");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("_X_X_XX_XX__");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("_X_X_XX_XX_X");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("XX_X_XX_XX_X");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("XXXX_XX_XX_X");
    }
}

