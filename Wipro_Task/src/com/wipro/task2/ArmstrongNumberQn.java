package com.wipro.task2;

import java.util.Scanner;

public class ArmstrongNumberQn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number to check if it's an Armstrong number: ");
        int number = sc.nextInt();
        String numStr = Integer.toString(number);
        int numDigits = numStr.length();
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
