package project.com;

import java.util.Scanner;

public class LogicalOperators {
    public static void main (String[] args) {
        System.out.println("Inside the logical operators class");
        orOperation();
    }

    private static void orOperation () {

        System.out.println("Inside the orOperation method");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the top score");
        int topScore = scanner.nextInt();
        if (topScore == 100) {
            System.out.println("You had a perfect score");
        } else if (topScore >= 80 && topScore < 100) {
            System.out.println("You got grade A");

        } else if (topScore >= 70 && topScore < 80) {
            System.out.println("You got grade B");
        } else if (topScore >= 60 && topScore < 70) {
            System.out.println("You got grade C");
        } else {
            System.out.println("Please improve your score");
        }
    }
}
