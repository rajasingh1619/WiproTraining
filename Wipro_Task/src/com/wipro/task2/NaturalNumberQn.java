package com.wipro.task2;

import java.util.Scanner;

public class NaturalNumberQn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the upper limit (n): ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Natural numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
    }
}

