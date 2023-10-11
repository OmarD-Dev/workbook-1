package com.pluralsight;

import java.util.Scanner;

public class MathApp {

    public static void main(String[] args){

        double pricePerPound;
        pricePerPound= 1.5;
        int poundsOfPotatoes;
        poundsOfPotatoes = 10;
        double price = pricePerPound * poundsOfPotatoes;


        System.out.printf("%8.2f\n",price);

        System.out.printf("%8.2f\n",price);

        double bobSalary= 75000;
        double garySalary =50000;

        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        double carPrice = 37000;
        double truckPrice= 47000;
        System.out.println("The cheaper vehicle costs " + Math.min(carPrice, truckPrice));

        //Distance between points (5,10) and (85,50)
        //points are (x,y) coordinates
        //Formula= Math.sqrt (pow((x2-x1), 2) + Math.pow((y2-y1), 2)

        double distance=0.0;

        distance= calculateDistanceBetween(85, 5, 50, 10);
        System.out.println("Distance between two points");
        System.out.println("Distance = " + distance);
        System.out.printf("Distance between %d points= %5.2f\n", 2, distance);

        // examples of other data types
        int num= 42;
        double pi= 3.14159;
        String name= "Alice";
        char grade = 'A';
        boolean isEnrolled= true;
        String formatted = String.format("Number: %d, Pi: %f, Name: %s, Grade: %c,Is enrolled: %b", num, pi, name, grade, isEnrolled);
        System.out.println(formatted);

        Scanner scanner = new Scanner(System.in);


        double inputValue= promptAndReturnDouble("Please enter a floating-point number");
        System.out.println(inputValue);


        System.out.println("Please enter your name: ");
        String inputString = scanner.nextLine();
        System.out.println(inputString);

        if (inputString.equals("Paul")){
            System.out.println("Go away, Paul");
        }
        else {
            System.out.println("Hello "+ inputString);
        }
        return;
    }

    public static double calculateDistanceBetween(double x2,double x1, double y2, double y1){
        return Math.sqrt(Math.pow(x2 - x1,2.0) + Math.pow(y2-y1,2.0));

    }

    public static double promptAndReturnDouble(String prompt){
        double value;
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt + " : ");
        value = scanner.nextDouble();
        // Clear the input buffer
        scanner.nextLine();
        return value;
    }
}
