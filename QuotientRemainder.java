package com.bridgelabz;

import java.util.Scanner;
public class QuotientRemainder {

    public static void main(String[] args) {
        int quotient, remainder;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter The Second Number: ");
        int num2 = scanner.nextInt();

        quotient = num1 / num2;
        remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}
