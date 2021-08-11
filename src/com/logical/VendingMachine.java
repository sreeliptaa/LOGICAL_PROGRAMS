package com.logical;

import java.util.Scanner;

/**
 *  calculate the minimum number of Notes as well as the Notes to be
 *  returned by the Vending Machine as a Change
 * @author Sreelipta
 */

public class VendingMachine {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter amoumt");
            int value = s.nextInt();
            notes(value);
            s.close();
        } catch (Exception e) {
            System.out.println("Enter value in integer");
        }
    }
    /*
     * static variable I is declared to change notes and Static variable TOTAL is
     * declared to count total notes
     */
    static int I, TOTAL;

    /*
     * Static array to store values of notes
     */
    static int[] NOTES = { 1000, 500, 100, 50, 10, 5, 2, 1 };

    /**
     * Function to find the notes and print the output
     *
     * @param value the amount to which the note to despenced
     */
    static void notes(int value) {
        if (value / NOTES[I] != 0) {
            TOTAL += (value / NOTES[I]);
            System.out.println(NOTES[I] + "rs notes :" + value / NOTES[I]);
            value = value % NOTES[I];
        }
        I++;
        if (value == 0) {
            System.out.println("total notes :" + TOTAL);
            return;
        }

        notes(value);

    }
}
