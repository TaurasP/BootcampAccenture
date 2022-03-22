package lt.viko.eif.tpetrauskas;

import java.util.Scanner;

public class Day2 {

    Scanner scanner = new Scanner(System.in);

    public void task1() {
        int a, b;

        System.out.println("Enter value a: ");
        a = scanner.nextInt();

        System.out.println("Enter value b: ");
        b = scanner.nextInt();

        System.out.println("Is " + a + " equal to " + b + "? - " + (a == b));
        System.out.println("Is " + a + " less than " + b + "? - " + (a < b));
        System.out.println("Is " + a + " less or equal to " + b + "? - " + (a <= b));
        System.out.println("Is " + a + " greater than " + b + "? - " + (a > b));
        System.out.println("Is " + a + " greater or equal to " + b + "? - " + (a >= b));
    }

    public void task2() {
        boolean b1, b2;

        System.out.println("Enter b1: ");
        b1 = scanner.nextBoolean();

        System.out.println("Enter b2: ");
        b2 = scanner.nextBoolean();

        System.out.println("Is " + b1 + " and " + b2 + " equal? - " + (b1 == b2));
    }

    public void task3() {
        System.out.println("Enter a whole number (integer): ");
        int num = scanner.nextInt();

        System.out.println((num % 2 == 0));
    }

    public void task4() {
        System.out.println("Enter a whole number (integer): ");
        int num = scanner.nextInt();

        System.out.println((num % 2 != 0));
    }

    public void task5() {
        System.out.println("Enter boolean value: ");
        boolean b = scanner.nextBoolean();

        System.out.println("Opposite of \"" + b + "\" is \"" + !b + "\"");
    }

    public void task6() {
        int a, b;

        System.out.println("Enter a whole number (integer) a: ");
        a = scanner.nextInt();

        System.out.println("Enter a whole number (integer) b: ");
        b = scanner.nextInt();

        System.out.println((a == b || a < 0 && b > 0 || a > 1001 && b > 1001));
    }

}
