package com.company;

import java.util.Scanner;

public class Problem4NumberComparer {

    public static void main(String[] args) {

//        Problem 4. Number Comparer
//        Write a program that gets two numbers from the console and prints the greater of them.
//        Try to implement this without if statements.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number1 = ");
        int numberOne = scanner.nextInt();
        System.out.println("Please enter number2 = ");
        int numberTwo = scanner.nextInt();

        System.out.println("The greater number is: " + Math.max(numberOne, numberTwo));

    }
}
