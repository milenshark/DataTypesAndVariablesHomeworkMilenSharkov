package com.company;

import java.util.Scanner;

public class Problem6SumOf5Numbers {

    public static void main(String[] args) {

//        Problem 6. Sum of 5 Numbers
//        Write a program that enters 5 numbers (each number will be on a separate/new line), calculates and prints their sum.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number = ");
        int numberOne = scanner.nextInt();
        System.out.println("Please enter second number = ");
        int numberTwo = scanner.nextInt();
        System.out.println("Please enter third number = ");
        int numberThree = scanner.nextInt();
        System.out.println("Please enter fourth number = ");
        int numberFour = scanner.nextInt();
        System.out.println("Please enter fifth number = ");
        int numberFive = scanner.nextInt();

        int result = numberOne + numberTwo + numberThree + numberFour + numberFive;


        System.out.println("The sum is: " + result);

    }
}
