package lt.viko.eif.tpetrauskas;

import java.util.Random;

public class Day3 {
    public void task1() {
        int[][] arrMultipleTable = new int[10][10];
        int row = 1, column = 1;
        for(int a = 0; a < arrMultipleTable.length; a++)
        {
            for(int b = 0; b < arrMultipleTable[a].length; b++)
            {
                arrMultipleTable[a][b] = row * column;
                column = column + 1;
            }
            row = row + 1;
            column = 1;
        }
        for(int a = 0; a < arrMultipleTable.length; a++)
        {
            for(int b = 0; b < arrMultipleTable[a].length; b++)
            {
                System.out.print(" " + arrMultipleTable[a][b] + "\t| ");
            }
            System.out.println();
        }
    }

    public void task2() {
        Random randomNum = new Random();
        int[] arrRandomNum = new int[4];

        System.out.print("Array of random numbers: ");
        for(int num : arrRandomNum) {
            arrRandomNum[num] = randomNum.nextInt(100);
            System.out.print(arrRandomNum[num] + " ");
        }
        System.out.println();
    }

    public void task3() {
        BankAccount bankAccount1 = new BankAccount(1000.00);
        BankAccount bankAccount2 = new BankAccount(500.00);

        bankAccount1.withdraw(2000.00);
        bankAccount2.deposit(10000);
        bankAccount1.transferFrom(bankAccount2, 10000);
        bankAccount2.printBalance();
    }

    public void task5() {
        Vehicle vehicle = new Vehicle(200);
        vehicle.getMaxSpeed();
        Car car = new Car(200, '6', 'P');
        car.getNumberOfGears();
        ElectricCar electricCar = new ElectricCar(250, '3', 'P', "Tesla", "Model 3", 400);
        electricCar.steer("left");
        electricCar.changeGears('1');
        electricCar.increaseSpeed(150);
        electricCar.increaseSpeed(150);
        electricCar.decreaseSpeed(300);
    }
}
