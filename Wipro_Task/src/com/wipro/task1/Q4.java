package WiproDay1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter length in centimeter: ");
        int centimeter = sc.nextInt();

        double meter = centimeter / 100.0;
        double kilometer = centimeter / 100000.0;

        System.out.println("Length in meter = " + meter + " m");
        System.out.println("Length in kilometer = " + kilometer + " km");
    }
}