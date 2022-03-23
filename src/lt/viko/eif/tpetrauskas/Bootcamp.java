package lt.viko.eif.tpetrauskas;

import java.util.Scanner;

public class Bootcamp {
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    public void start() {
        while(!exit) {
            showMainMenu();
            selectFromMainMenu();
        }
    }

    public void showMainMenu() {
        System.out.println("\n*************** ACCENTURE BOOTCAMP ***************");
        System.out.println("1. DAY 1");
        System.out.println("2. DAY 2");
        System.out.println("3. DAY 3");
        System.out.println("**************************************************");
        System.out.println("0. EXIT");
        System.out.println("**************************************************");
    }

    public void showDay1() {
        Day1 day1 = new Day1();
        day1.task1();
    }

    public void showDay2Task(int task) {
        Day2 day2 = new Day2();

        switch (task) {
            case 1:
                day2.task1();
                break;
            case 2:
                day2.task2();
                break;
            case 3:
                day2.task3();
                break;
            case 4:
                day2.task4();
                break;
            case 5:
                day2.task5();
                break;
            case 6:
                day2.task6();
                break;
            default:
                System.out.println("Error. Please enter a valid task option.");
                break;
        }
    }

    public void showDay3Task(int task) {
        Day3 day3 = new Day3();

        switch (task) {
            case 1:
                day3.task1();
                break;
            case 2:
                day3.task2();
                break;
            case 3:
                day3.task3();
                break;
            case 5:
                day3.task5();
                break;
            default:
                System.out.println("Error. Please enter a valid task option.");
                break;
        }
    }

    public void showDay2Menu() {
        System.out.println("\n********************* DAY 2 **********************");
        System.out.println("1. TASK 1 (2 entered numbers comparison)");
        System.out.println("2. TASK 2 (2 entered booleans comparison)");
        System.out.println("3. TASK 3 (if entered number is even - true, if odd - false)");
        System.out.println("4. TASK 4 (if entered number is odd - true, if even - false)");
        System.out.println("5. TASK 5 (show the opposite of entered boolean)");
        System.out.println("6. TASK 6 (if 2 entered numbers meets 1 of 3 conditions - true)");
        System.out.println("**************************************************");
        System.out.println("0. RETURN TO MAIN MENU");
        System.out.println("**************************************************");
    }

    public void showDay3Menu() {
        System.out.println("\n********************* DAY 3 **********************");
        System.out.println("1. TASK 1 (multiplication table)");
        System.out.println("2. TASK 2 (copying 4 random numbers to an array)");
        System.out.println("3. TASK 3 (BankAccount)");
        System.out.println("5. TASK 5 (Vehicle)");
        System.out.println("**************************************************");
        System.out.println("0. RETURN TO MAIN MENU");
        System.out.println("**************************************************");
    }

    public void selectFromMainMenu() {
        System.out.println("Select from menu: ");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                // DAY 1
                showDay1();
                break;
            case 2:
                // DAY 2
                showDay2Menu();
                selectFromDay2();
                break;
            case 3:
                // DAY 3
                showDay3Menu();
                selectFromDay3();
                break;
            case 0:
                // EXIT
                exit = true;
                break;
            default:
                System.out.println("Error. Please enter a valid day option.");
                break;
        }
    }

    public void selectFromDay2() {
        System.out.println("Select a task: ");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                showDay2Task(1);
                break;
            case 2:
                showDay2Task(2);
                break;
            case 3:
                showDay2Task(3);
                break;
            case 4:
                showDay2Task(4);
                break;
            case 5:
                showDay2Task(5);
                break;
            case 6:
                showDay2Task(6);
                break;
            case 0:
                break;
            default:
                System.out.println("Error. Please enter a valid task option.");
                break;
        }
    }

    public void selectFromDay3() {
        System.out.println("Select a task: ");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                showDay3Task(1);
                break;
            case 2:
                showDay3Task(2);
                break;
            case 3:
                showDay3Task(3);
                break;
            case 5:
                showDay3Task(5);
                break;
            case 0:
                break;
            default:
                System.out.println("Error. Please enter a valid task option.");
                break;
        }
    }
}
