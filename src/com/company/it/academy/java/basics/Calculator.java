package com.company.it.academy.java.basics;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {

    //Task 10

    public static void main(String[] args) {
        doCalculation();
    }

    static void repeatTask () {
        String done = "Done!";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to calculate again?");
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            doCalculation();
        }else {
            System.out.println("Done!");;
        }
    }


        static void doCalculation(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please, enter figure: ");
            String figure = scanner.nextLine().toLowerCase(Locale.ROOT);

            switch (figure) {
                case "triangle":
                    System.out.println("Please, enter the side: ");
                    int sideOne = scanner.nextInt();
                    System.out.println("Please, enter the side: ");
                    int sideTwo = scanner.nextInt();
                    System.out.println("Please, enter the base: ");
                    int base = scanner.nextInt();
                    System.out.println("Please, enter the height: ");
                    int height = scanner.nextInt();
                    int perimeter = sideOne + sideTwo + base;
                    double area = 0.5 * base * height;
                    if ((sideOne == 0) || (sideTwo == 0) || (base == 0) || (height == 0) ){
                        System.out.println("Triangle values can't be 0");
                        repeatTask();
                    }
                    System.out.println("Triangle perimeter is " + perimeter + " and area is " + area);
                    repeatTask();

                case "rectangle":
                    System.out.println("Please, enter the length: ");
                    int rLenght = scanner.nextInt();
                    System.out.println("Please, enter the width: ");
                    int rWidth = scanner.nextInt();
                    int rPerimeter = 2 * (rLenght + rWidth);
                    int rArea = rLenght * rWidth;
                    if ((rLenght == 0) || (rWidth == 0)) {
                        System.out.println("Rectangle values can't be 0");
                        repeatTask();
                    }
                    System.out.println("Rectangle perimeter is " + rPerimeter + " and area is " + rArea);
                    repeatTask();

                case "square":
                    System.out.println("Please, enter the side: ");
                    int sqSide = scanner.nextInt();
                    int sqPerimeter = 4 * sqSide;
                    int sqArea = sqSide * sqSide;

                    if (sqSide == 0) {
                        System.out.println("Square value can't be 0");
                        repeatTask();
                    }
                    System.out.println("Square perimeter is " + sqPerimeter + " and area is " + sqArea);
                    repeatTask();
            }
        }





}
