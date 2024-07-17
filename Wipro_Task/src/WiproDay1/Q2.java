package WiproDay1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = sc.nextInt();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Diameter = " + diameter + " units");
        System.out.println("Circumference = " + String.format("%.2f", circumference) + " units");
        System.out.println("Area = " + String.format("%.2f", area) + " sq. units");
    }
}