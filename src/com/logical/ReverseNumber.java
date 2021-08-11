package com.logical;

import java.util.Scanner;
/**
 * Compute reverse of a given number
 * @author Sreelipta
 */

public class ReverseNumber {
    static int reverseNumber(int number){
        int reverseNum=0;
        while(number>0){
            reverseNum=reverseNum*10+number%10;
            number/=10;
        }
        return reverseNum;
    }
    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("Reverse of "+number+" is "+reverseNumber(number));
    }
}

