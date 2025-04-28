package com.proj.section5;

public class SpeedConvertor {
    public static void main (String[] args) {
        System.out.println("Inside the SpeedConvertor class");
        testData();

    }

    private static void testData () {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static void printConversion (double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long convertedValue = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + "km/h = " + convertedValue + " mi/h");
        }
    }

    public static long toMilesPerHour (double kilometerPerHour) {
        System.out.println("Inside the toMilesPerHour method");
        if (kilometerPerHour < 0) {
            return -1;
        } else {
            long result = Math.round(kilometerPerHour / 1.609);
            return result;
        }

    }
}
