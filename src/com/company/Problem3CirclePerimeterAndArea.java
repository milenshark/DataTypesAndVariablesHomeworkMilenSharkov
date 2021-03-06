package com.company;

import java.util.Scanner;

public class Problem3CirclePerimeterAndArea {

    public static void main(String[] args) {

//        Problem 3. Circle Perimeter and Area
//        Write a program that reads the radius r of a circle and prints its perimeter and area formatted
//        with 2 digits after the decimal point.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius r =");
        double r = Double.parseDouble(scanner.nextLine());

        double circlePerimeter = Math.round((2*Math.PI*r)*100) / 100.0;
        double circleArea = Math.round(Math.PI*Math.pow(r, 2)*100) / 100.0;

        System.out.println("The perimeter of the circle is: " + circlePerimeter);
        System.out.println("The area of the circle is: " + circleArea);

    }
}
