package com.bridgelabz;

import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter an Year : ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Year is a leap year");
        else
            System.out.println("Year is not a leap year");
    }
}
