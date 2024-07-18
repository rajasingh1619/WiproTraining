package com.wipro.task2;

import java.util.Scanner;

public class DivisibleByDigitSumQn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sumOfDigits = sumOfDigits(number);

        if (number % sumOfDigits == 0) {
            System.out.println(number + " is divisible by the sum of its digits (" + sumOfDigits + ").");
        } else {
            System.out.println(number + " is not divisible by the sum of its digits (" + sumOfDigits + ").");
        }
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
