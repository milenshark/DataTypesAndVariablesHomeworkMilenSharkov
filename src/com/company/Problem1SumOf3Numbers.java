package com.company;

import java.util.Scanner;

public class Problem1SumOf3Numbers {

    public static void main(String[] args) {

//        Problem 1. Sum of 3 Numbers
//        Write a program that reads 3 int numbers from the console and prints their sum.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some integer numbers a b c ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a+b+c;

        System.out.println("The sum of the numbers is " + sum);

    }
}
