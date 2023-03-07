package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Enter Your age: ");
        String age = scanner.nextLine();


        System.out.println("Hello my name is" + name + surname + "and I am" + age +
                "years old. I am attending IT & Data Academy 2023!");
    }

}
