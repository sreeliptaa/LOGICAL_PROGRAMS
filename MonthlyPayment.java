package com.logical;

import java.util.Scanner;

/**
 * Calculates monthly payment for given principle,years and interest rate
 * @author Sreelipta
 */

public class MonthlyPayment {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        double rate = sc.nextDouble();
        rate = (rate / 100) / 12;
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        year = year * 12;
        double p = (principal * rate) / (1 - Math.pow(1 + rate, -year));
        System.out.println("Payment: " + p);
        sc.close();
    }
}