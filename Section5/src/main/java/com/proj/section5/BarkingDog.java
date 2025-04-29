package com.proj.section5;

public class BarkingDog {
    public static void main (String[] args) {
        testConditons();

    }

    private static void testConditons () {
        boolean wakeUP = shouldWakeUp(true, 1);
        printResult(wakeUP);
        wakeUP = shouldWakeUp(false, 2);
        printResult(wakeUP);
        wakeUP = shouldWakeUp(true, 8);
        printResult(wakeUP);
        wakeUP = shouldWakeUp(true, -1);
        printResult(wakeUP);

    }

    private static void printResult (boolean wakeUP) {
        if (wakeUP) {
            System.out.println("Dog is barking, wake up!");
        } else {
            System.out.println("Dog is not barking, sleep well!");
        }
    }

    public static boolean shouldWakeUp (boolean isBarking, int hour) {
        if (isBarking && ((hour >= 0 && hour < 8) || (hour > 22 && hour < 24))) {
            return true;
        } else {
            return false;
        }
    }
}
