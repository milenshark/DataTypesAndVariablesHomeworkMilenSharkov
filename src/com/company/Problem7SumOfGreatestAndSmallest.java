package com.company;

import java.util.Scanner;

public class Problem7SumOfGreatestAndSmallest {

    public static void main(String[] args) {

//        Problem 7. Sum of greatest and smallest
//        Write a program that enters 3 numbers (each number will be on a separate/new line), calculates and prints the sum of the greatest and smallest of them.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number = ");
        int numberOne = scanner.nextInt();
        System.out.println("Please enter second number = ");
        int numberTwo = scanner.nextInt();
        System.out.println("Please enter third number = ");
        int numberThree = scanner.nextInt();

        int greatestNumber = Math.max(numberOne, Math.max(numberTwo, numberThree));
        int smallestNumber = Math.min(numberOne, Math.min(numberTwo, numberThree));
        int result = greatestNumber + smallestNumber;


        System.out.println("The sum of greatest and smallest number is " + result);

    }
}
