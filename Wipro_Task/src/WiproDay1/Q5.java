package WiproDay1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("First number after swapping: " + num1);
        System.out.println("Second number after swapping: " + num2);
    }
}