package com.logical;

import java.util.Scanner;

/**
 * Conversion of decimal number to binary number
 * @author Sreelipta
 */

public class ToBinary {
    public static void main(String[] args){
        System.out.println("Enter a Decimal no :");
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        toBinaryNumber(number);
    }
    static void print(int[] binary,int i){
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]+" ");
        }
    }
    static void toBinaryNumber(int number){
        int[] binaryNumber=new int[35];
        int i=0;
        while (number>0){
            binaryNumber[i++]=number%2;
            number/=2;
        }
        print(binaryNumber,i);
    }
}
