package com.logical;
import java.util.Scanner;
public class FibonacciSeries {
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

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to Fibonacci Series");
        System.out.println("Give number: (N>0)");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0) {
            fibonacciTerms(number);
        }else{
            System.out.println("Incorrect Input");
        }
    }
}
