package com.logical;

import java.util.Scanner;

/**
 *  StopWatch that displays time elapsed
 * @author Sreelipta
 */

public class StopWatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any button to start");
        s.next();
        startTime();
        System.out.println("enter any button to stop");
        s.next();
        stopTime();
        elapsedTime();
    }
    /*
     * static variables for storing starting and end time
     */
    static double start = 0, stop = 0;
    /**
     * Function to put start time and print it
     */
    static void startTime() {
        start = System.currentTimeMillis();
        System.out.println("started at " + start);
    }
    /**
     * function to put stop time and print it
     */
    static void stopTime() {
        stop = System.currentTimeMillis();
        System.out.println("stopped at " + stop);
    }

    /**
     * function to calculate elapsed time and print it
     */
    static void elapsedTime() {
        System.out.println("elapsed time is " + (stop - start) / 1000);
    }
}
