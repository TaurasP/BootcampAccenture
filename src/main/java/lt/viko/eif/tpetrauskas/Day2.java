package lt.viko.eif.tpetrauskas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day2 {

    Scanner scanner = new Scanner(System.in);

    public void task1() {
        int a, b;

        try {
            System.out.println("Enter value a (integer): ");
            a = scanner.nextInt();

            System.out.println("Enter value b (integer): ");
            b = scanner.nextInt();

            System.out.println("Is " + a + " equal to " + b + "? - " + (a == b));
            System.out.println("Is " + a + " less than " + b + "? - " + (a < b));
            System.out.println("Is " + a + " less or equal to " + b + "? - " + (a <= b));
            System.out.println("Is " + a + " greater than " + b + "? - " + (a > b));
            System.out.println("Is " + a + " greater or equal to " + b + "? - " + (a >= b));
        } catch (InputMismatchException ex) {
            System.out.println("Exception: " + ex);
            System.out.println("Number (integer) value expected.");
        }
    }

    public void task2() {
        boolean b1, b2;

        try {
            System.out.println("Enter b1 (boolean): ");
            b1 = scanner.nextBoolean();

            System.out.println("Enter b2 (boolean): ");
            b2 = scanner.nextBoolean();

            System.out.println("Is " + b1 + " and " + b2 + " equal? - " + (b1 == b2));
        } catch (InputMismatchException ex) {
            System.out.println("Exception: " + ex);
            System.out.println("Boolean (true/false) value expected.");
        }
    }

    public void task3() {
        try {
            System.out.println("Enter a whole number (integer): ");
            int num = scanner.nextInt();

            System.out.println((num % 2 == 0));
        } catch (InputMismatchException ex) {
            System.out.println("Exception: " + ex);
            System.out.println("Number (integer) value expected.");
        }
    }

    public void task4() {
        try {
            System.out.println("Enter a whole number (integer): ");
            int num = scanner.nextInt();

            System.out.println((num % 2 != 0));
        } catch (InputMismatchException ex) {
            System.out.println("Exception: " + ex);
            System.out.println("Number (integer) value expected.");
        }
    }

    public void task5() {
        try {
            System.out.println("Enter boolean value: ");
            boolean b = scanner.nextBoolean();

            System.out.println("Opposite of \"" + b + "\" is \"" + !b + "\"");
        } catch (InputMismatchException ex) {
            System.out.println("Exception: " + ex);
            System.out.println("Boolean (true/false) value expected.");
        }
    }

    public void task6() {
        int a, b;

        try {
            System.out.println("Enter a whole number (integer) a: ");
            a = scanner.nextInt();

            System.out.println("Enter a whole number (integer) b: ");
            b = scanner.nextInt();

            System.out.println((a == b || a < 0 && b > 0 || a > 1001 && b > 1001));
        } catch (InputMismatchException ex) {
            System.out.println("Exception: " + ex);
            System.out.println("Number (integer) value expected.");
        }
    }
}
