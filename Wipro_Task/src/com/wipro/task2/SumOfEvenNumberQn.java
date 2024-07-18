package com.wipro.task2;

import java.util.Scanner;

public class SumOfEvenNumberQn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input upper limit of even number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers between 1 to " + n + ": " + sum);
    }
}
