package com.company;

import java.util.Scanner;

public class Problem5QuadraticEquation {

    public static void main(String[] args) {

//        Problem 5. Quadratic Equation
//        Write a program that reads the coefficients a, b and c of a quadratic equation ax2 + bx + c = 0 and solves it (prints its real roots).
//        Assume there always will be one or two real roots (b2 - 4ac >= 0)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first coefficient a = ");
        double a = scanner.nextDouble();
        System.out.println("Please enter second coefficient b = ");
        double b = scanner.nextDouble();
        System.out.println("Please enter third coefficient c = ");
        double c = scanner.nextDouble();



        double determinant = b * b - 4 * a * c;

        // determinant should be >=0

        double x1 = (-b - Math.sqrt(determinant)) / (2 * a);
        double x2 = (-b + Math.sqrt(determinant)) / (2 * a);

        System.out.format("x1 = %.2f; x2 = %.2f", x1, x2);

    }
}
