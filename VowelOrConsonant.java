package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.print("Enter Alphabet=> ");
            char letter = scanner.next().charAt(0);

            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print("It's a vowel");
                    break;
                default:
                    System.out.print("It's not a vowel");
            }
        }
    }
}