package com.sg.oop.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SimpleCalculator simpleCal = new SimpleCalculator();
        Scanner scannerInput = new Scanner(System.in);
        int operation;

        while (true) {
            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("2. multiplication");
            System.out.println("4. division");
            System.out.println("5. exit");
            System.out.println("Select operation ");
            operation = scannerInput.nextInt();

            if ( operation== 5) {
                System.out.println("Thank for using Simple calculator");
                System.exit(0);
            }

            System.out.println("Enter first number to perform operation");
            double num1 = scannerInput.nextDouble();
            System.out.println("Enter second number to perform operation");
            double num2 = scannerInput.nextDouble();

            if (operation == 1) {
                simpleCal.addition(num1, num2);
            }
            else if (operation == 2) {
                simpleCal.subtraction(num1, num2);
            }
            else if (operation == 3) {
                simpleCal.multiplication(num1, num2);
            }
            else if (operation == 4) {
                if(num2 == 0){
                    System.out.println("Can not divid by zero");
                    continue;
                }
                simpleCal.division(num1, num2);
            }

        }
    }
}

