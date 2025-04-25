package project.com;

import java.util.Scanner;

public class IFStatement {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the flag value");
        boolean flag = scanner.nextBoolean();
        if (flag) {
            System.out.println("Flag is true");
            System.out.println("You are ready  to rock");
        } else {
            System.out.println("flag is false");
            System.out.println("You need to wait");
        }
    }
}
