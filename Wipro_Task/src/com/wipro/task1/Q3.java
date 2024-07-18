package WiproDay1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of the triangle: ");
        int base = sc.nextInt();

        System.out.print("Enter height of the triangle: ");
        int height = sc.nextInt();

        double area = 0.5 * base * height;

        System.out.println("Area of the triangle = " + area + " sq. units");
    }
}