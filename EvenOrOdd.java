package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is a even number.");
        else
            System.out.println(num + " is a odd number.");
    }
}
