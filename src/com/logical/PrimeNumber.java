package com.logical;

import java.util.Scanner;
/**
 * Checking the prime number
 * @author Sreelipta
 */

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        checkPrime(number);
    }
    static void checkPrime(int number){
        int count=0;
        for(int i=2;i<number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Its a Prime Number");
        }else{
            System.out.println("Its not a Not Prime Number");
        }

    }

}
