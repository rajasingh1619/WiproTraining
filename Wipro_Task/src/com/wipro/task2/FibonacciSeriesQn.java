package com.wipro.task2;

import java.util.Scanner;

public class FibonacciSeriesQn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int terms = sc.nextInt();
        int a = 0; 
        int b = 1; 
        int c;   
        System.out.println("Fibonacci series:");
        if (terms >= 1) {
            System.out.print(a);
        }
        if (terms >= 2) {
            System.out.print(", " + b);
        }
        for (int i = 3; i <= terms; i++) {
            c = a + b; 
            System.out.print(", " + c); 
            a = b;
            b = c;
        }
        
        System.out.println(); 
    }
}

