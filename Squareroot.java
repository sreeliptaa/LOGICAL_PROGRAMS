package com.logical;

import java.util.Scanner;

/**
 * Square Root calculated using Newton's method
 * @author Sreelipta
 */

public class Squareroot {
    final static double epsilon=1e-15;
    static void newtonsMethod(double number){
        double t=number;
        while(Math.abs(t-number/t)>epsilon*t){
            t= (t+number/t)/2;
        }
        System.out.println("Square Root of the No :"+t);
    }
    public static void main(String[] args){
        System.out.println("Square Root using Newton's method");
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        double value=sc.nextDouble();
        if(value>=0) {
            newtonsMethod(value);
        }else {
            System.out.println("Incorrect Input");
        }
    }
}