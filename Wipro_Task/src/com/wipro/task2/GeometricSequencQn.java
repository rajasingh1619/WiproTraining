package com.wipro.task2;

import java.util.Scanner;

public class GeometricSequencQn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();

        int firstTerm = 1;
        int commonRatio = 2;

        System.out.print("The geometric sequence is: ");
        for (int i = 0; i < n; i++) {
            int term = firstTerm * (int) Math.pow(commonRatio, i);
            System.out.print(term + " ");
            if (term > 1024) {
                break;
            }
        }
    }
}