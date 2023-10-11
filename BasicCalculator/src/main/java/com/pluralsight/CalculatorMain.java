package com.pluralsight;

import java.util.Scanner;

public class CalculatorMain {

    public static void  main(String[] args) {
        System.out.println("Welcome to your calculator!");

        Scanner scanner = new Scanner(System.in);

        double inputValue1 = requestDoubleInput(scanner);
        double inputValue2 = requestDoubleInput(scanner);

        double result = 0.;

        boolean done = false;

        while (!done) {
            System.out.println("""
                    Enter one of the following choices:
                    A -to add
                    S - to subtract
                    M - to multiply
                    D - to divide
                    """);

            char menuChoice = scanner.next().charAt(0);
            switch (menuChoice) {
                case 'A':
                case 'a':
                    result = inputValue1 + inputValue2;
                    done = true;
                    break;
                case 'S':
                case 's':
                    result = inputValue1 - inputValue2;
                    done = true;
                    break;
                case 'M':
                case 'm':
                    result = inputValue1 * inputValue2;
                    done = true;
                    break;
                case 'D':
                case 'd':
                    result = inputValue1 / inputValue2;
                    done = true;
                    break;
                default:
                    System.out.println("I didn't understand that ");


                }
            }

            System.out.println("Your answer is " + result);
        }


        private static double requestDoubleInput(Scanner scanner){
            double inputValue= 0.0;
            System.out.println("Please enter a floating point number:");
            inputValue = scanner.nextDouble();
            scanner.nextLine();
            return inputValue;
        }
    }
