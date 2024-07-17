package WiproDay1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter principle: ");
        double principle = sc.nextDouble();

        System.out.print("Enter time: ");
        int time = sc.nextInt();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        double simpleInterest = (principle * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);
    }
}