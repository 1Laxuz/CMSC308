package com.java.rapirap;
import java.util.Scanner;

public class takers {
    public static double num1, num2;
    public static void taker()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number[1]:");
        num1 = sc.nextDouble();
        System.out.print("Enter a number[2]:");
        num2 = sc.nextDouble();   
    }   
}
