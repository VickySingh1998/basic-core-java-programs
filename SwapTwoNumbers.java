package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Before Swapping:-");
        System.out.println("Enter The First Number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter The Second Number: ");
        int num2 = scanner.nextInt();

        int swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.println("After swapping:-");
        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);
    }
}