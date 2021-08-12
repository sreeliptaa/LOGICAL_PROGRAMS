package com.logical;

import java.util.Scanner;

/**
 * Finding number after Swapping binary nibbles and check if resulting number is power of two
 * @author Sreelipta
 */

public class Binary {
    public static void main(String[] args) {
        System.out.println("Convert number to Binary");
        System.out.println("Enter integer input :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        swapBinaryNibbles(number);
    }
    static int swapNibbles(int x)
    {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }
    static void print(int[] binary,int i){
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]+" ");
        }
        System.out.println();
    }
    static void powerOfTwo(int number){
        int count=0,num=number;
        while(number>0){
            if(number%2==0){
                number/=2;
                count++;
            }else{
                break;
            }
        }
        if(num==Math.pow(2,count)){
            System.out.println("Resulting number is Power of Two");
        }else{
            System.out.println("Resulting number is not Power of Two");
        }
    }
    static void swapBinaryNibbles(int number){
        int[] binaryNumber=new int[35];
        int i=0,num=number;
        while (number>0){
            binaryNumber[i++]=number%2;
            number/=2;
        }
        System.out.println("Before swapping nibbles");
        print(binaryNumber,i);
        System.out.println("After swapping "+swapNibbles(num));
        powerOfTwo(num);
    }
}
