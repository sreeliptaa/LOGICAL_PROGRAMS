package com.logical;
import java.util.Scanner;
/**
 * Print the perfect number
 * @author Sreelipta
 */

public class PerfectNumber {
    public static void main(String[] args){
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        checkPerfectNumber(number);
    }
    static void checkPerfectNumber(int number){
        int sum=0,num=number;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println("Its a Perfect Number");
        }else{
            System.out.println("Its Not a Perfect Number");
        }
    }
}
