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

        float overtimeHours = hoursWorked - 40;
        float overtimePay = 0;
        float regularPay = 0;
        float grossPay = 0;

        if (overtimeHours > 0){
            overtimePay = (float) (overtimeHours * (payRate * 1.5));
            regularPay = (hoursWorked - overtimeHours) * payRate;
            grossPay = overtimePay + regularPay;
        } else {
            regularPay = hoursWorked * payRate;
            grossPay = regularPay;
        }

        System.out.printf("Employee name:  %s, your pay this week was %.2f and you had %.2f overtime hours." , userName, grossPay, overtimeHours);
    }
}