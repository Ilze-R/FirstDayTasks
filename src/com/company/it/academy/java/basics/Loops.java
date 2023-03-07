package com.company.it.academy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        for task 7 and 8
//        int days = scanner.nextInt();
        int number = scanner.nextInt();


//       7 TASK

//        for (int i = 0; i <= days; i++){
//          int hours = i * 24;
//          int minutes = hours * 60;

//        8 TASK

//        int i = 0;
//        while (i < 365){
//        i++;
//        int hours = i * 24;
//        int minutes = hours * 60;
//
//          if(i == days){
//              System.out.println("There are " + hours +
//                      " hours or " + minutes +
//                      " minutes in one year");
//          }
//        }

//        9 TASK

        int sum = 1;
        for (int i = number; i >= 1; i--) {
            sum = i * sum;
            if (i == 1) {
                System.out.println("Factorial of number " + number + " is " + sum);
            }
        }

    }
}
