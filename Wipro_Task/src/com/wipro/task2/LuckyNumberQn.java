package com.wipro.task2;

import java.util.Scanner;

public class LuckyNumberQn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Input a number to check if it's a lucky number: ");
        long number = sc.nextLong();
        String numStr = Long.toString(number);
        int len = numStr.length();

        int sumOfSquares = 0;
        for (int i = 1; i < len; i += 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sumOfSquares += digit * digit;
        }

        if (sumOfSquares % 9 == 0) {
            System.out.println(number + " is a lucky number.");
        } else {
            System.out.println(number + " is not a lucky number.");
        }
    }
}
