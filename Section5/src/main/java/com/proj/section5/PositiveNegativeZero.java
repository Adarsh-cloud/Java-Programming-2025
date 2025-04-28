package com.proj.section5;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main (String[] args) {
        System.out.println("Inside the PositiveNegativeZero class");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        checkNumber(number);
    }

    private static void checkNumber (int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
