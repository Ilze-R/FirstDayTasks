package com.company.it.academy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        // Task 3
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        int volume = number * number * number;
//        int summ = number * 3;
//       int perimeter = 4 * summ;
//
//        System.out.println("Cube's volume: " + volume + "cm3");
//        System.out.println("cube's perimeter: " + perimeter + "cm");


        //Task 4
        Scanner scanner = new Scanner(System.in);
        double feet = scanner.nextDouble();
        double inches = scanner.nextDouble();

        double totalInches = (feet * 12) + inches;

        double result = totalInches * 2.54;

        System.out.println(feet + " feet and " + inches + " = " + result + " cm");
    }

}
