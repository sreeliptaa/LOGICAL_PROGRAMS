package com.logical;

import java.util.Scanner;
/**
 * Print the Fibonacci Series
 * @author Sreelipta
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        //
        System.out.println("Welcome to Fibonacci Series");
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0) {
            fibonacciTerms(number);
        }else{
            System.out.println("Incorrect Input");
        }
    }
    static void fibonacciTerms(int number){
        int term1=0,term2=1,term3;
        if(number==1){
            System.out.println(term1);
        } else if(number==2){
            System.out.println(term1+" "+term2);
        } else{
            for(int i=0;i<number;i++){
                System.out.println(term1);
                term3=term1+term2;
                term1=term2;
                term2=term3;
            }
        }
    }
}

