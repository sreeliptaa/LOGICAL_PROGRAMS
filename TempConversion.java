package com.logical;

import java.util.Scanner;

/**
 * Temperature conversion from celsius to fahrenheit and vice-versa
 * @author Sreelipta
 */

public class TempConversion {
    static double celsiusToFahrenheit(double temperature){
        return ((9*temperature/5)+32);
    }
    static double fahrenheitToCelsius(double temperature){
        return (temperature-32)*5/9;
    }

    public static void main(String[] args){
        System.out.println("Choose: 1: Celsius to Fahrenheit 2. Fahrenheit to Celsius");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        System.out.println("Enter temperature: ");
        double temperature=sc.nextDouble();
        switch (choice){
            case 1:
                System.out.println("Celsius :"+temperature+" in Fahrenheit: "+celsiusToFahrenheit(temperature));
                break;
            case 2:
                System.out.println("Fahrenheit: "+temperature+" in Celsius: "+fahrenheitToCelsius(temperature));
                break;
            default:
                System.out.println("Incorrect Choice");
        }
    }
}
