package com.wipro.task2;

import java.util.Scanner;
public class ReverseNumberQn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Natural numbers from " + n + "-1 in reverse: ");
        for (int i = n; i >= 1; i--) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}
