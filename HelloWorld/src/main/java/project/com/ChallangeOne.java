package project.com;

public class ChallangeOne {
    public static void main (String[] args) {
        challangeCode();
    }

    private static void challangeCode () {
        System.out.println("Inside the challange code");
        double firstValue = 20, secondValue = 80;
        System.out.println("First value is " + firstValue);
        System.out.println("second value is " + secondValue);
        double result = (firstValue + secondValue) * 100;
        System.out.println("Result is " + result);
        double reminder = result % 40.00;
        System.out.println("reminder is " + reminder);
        boolean flag = reminder == 0.00 ? true : false;
        System.out.println(flag);
        if (!flag) {
            System.out.println("got some reminder");
        } else {
            System.out.println("no reminder");
        }

    }
}
