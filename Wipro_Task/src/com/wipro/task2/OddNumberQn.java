package com.wipro.task2;

import java.util.Scanner;

public class OddNumberQn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n = sc.nextInt();
        System.out.print("Odd numbers between 1 to " + n + ":\n");
        for (int i = 1; i <= n; i += 2) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(", " + i);
            }
        }
        System.out.println();
    }
}
