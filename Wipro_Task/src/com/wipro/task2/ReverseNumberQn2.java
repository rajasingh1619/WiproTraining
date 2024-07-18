package com.wipro.task2;

import java.util.Scanner;

public class ReverseNumberQn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number = number / 10;
        }
        System.out.println("Reverse of " + originalNumber + " = " + reversedNumber);
    }
}
