package com.company.it.academy.java.basics;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {

// Task 5
//        Scanner scanner = new Scanner(System.in);
//        int sideOne = scanner.nextInt();
//        int sideTwo = scanner.nextInt();
//        int sideThree = scanner.nextInt();
//
//        if(sideOne == sideTwo && sideTwo ==sideThree){
//            System.out.println("Triangle is Equilateral. Sides: " + sideOne + " " + sideTwo + " "
//            + sideThree);
//        }else{
//            System.out.println("Triangle is invalid. Sides: " + sideOne + " " + sideTwo + " "
//                    + sideThree);
//        }


// task 6 -> error in task example about fuel calculation (maybe but probably)
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int fuel = scanner.nextInt();
        int fuelUsage = scanner.nextInt();
        double price = scanner.nextDouble();

        int neededFuel = (fuelUsage * 100) / distance;
        int leftFuel = fuel - neededFuel;
        int howMuchMoreFuelNeed = neededFuel - fuel;
        double cost = howMuchMoreFuelNeed * price;


        if(neededFuel == fuel || neededFuel < fuel){
            System.out.println("Destination is in " + distance + "km. Car is able to reach the destination. It will have "
            + leftFuel + " liters of fuel left");
        }else{
            System.out.println("Destination is in " + distance + "km. Car is not able to reach the destination. It needs "
            + howMuchMoreFuelNeed + " liter of fuel more. It will cost "
            + cost + ".");
        }

    }
}
