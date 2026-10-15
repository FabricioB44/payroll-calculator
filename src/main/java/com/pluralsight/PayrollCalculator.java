package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();
        System.out.println("Enter you pay rate: ");
        float payRate = scanner.nextFloat();

        float grossPay = hoursWorked * payRate;

        System.out.printf("Employee name:  %s, your pay this week was %.2f%n" , userName, grossPay);
    }
}