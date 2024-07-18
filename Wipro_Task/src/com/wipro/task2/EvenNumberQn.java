package com.wipro.task2;

import java.util.Scanner;

public class EvenNumberQn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper range: ");
        int n = sc.nextInt();
        System.out.print("Even numbers between 1 to " + n + ":\n");
        for (int i = 2; i <= n; i += 2) {
            if (i == 2) {
                System.out.print(i);
            } else {
                System.out.print(", " + i);
            }
        }
        System.out.println(); 
    }
}
