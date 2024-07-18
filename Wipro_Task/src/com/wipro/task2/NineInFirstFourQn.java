package com.wipro.task2;
import java.util.*;

public class NineInFirstFourQn {
    public boolean hasNineInFirstFour(int[] arr) {
        for (int i = 0; i < arr.length && i < 4; i++) {
            if (arr[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        NineInFirstFourQn nineInFirstFour = new NineInFirstFourQn();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Has 9 in first 4: " + nineInFirstFour.hasNineInFirstFour(arr));

        
    }
}
