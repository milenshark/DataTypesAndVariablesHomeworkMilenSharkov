package com.company;

import java.util.Scanner;

public class Problem2PrintCompanyInformation {

    public static void main(String[] args) {

//        Problem 2. Print Company Information
//        A company has name, address, phone number, fax number, web site and manager.
//        The manager has first name, last name, age and a phone number.
//        Write a program that reads the information about a company and its manager and prints it back on the console.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Company name: ");
        String companyName = scanner.nextLine();
        System.out.println("Please enter Company address: ");
        String companyAddress = scanner.nextLine();
        System.out.println("Please enter Company phone number: ");
        String companyPhoneNumber = scanner.nextLine();
        System.out.println("Please enter Company fax number: ");
        String companyFaxNumber = scanner.nextLine();
        System.out.println("Please enter Company website: ");
        String companyWebsite = scanner.nextLine();
        System.out.println("Please enter Manager first name: ");
        String managerFirstName = scanner.nextLine();
        System.out.println("Please enter Manager last name: ");
        String managerLastName = scanner.nextLine();
        System.out.println("Please enter Manager age: ");
        String managerAge = scanner.nextLine();
        System.out.println("Please enter Manager phone: ");
        String managerPhone = scanner.nextLine();

        System.out.println(System.lineSeparator() + companyName);
        System.out.println("Address: " + companyAddress);
        System.out.println("Tel. " + companyPhoneNumber);
        if (companyFaxNumber.isEmpty())
        {
            System.out.println("Fax: (no fax)");
        }
        else
        {
            System.out.println("Fax: " + companyFaxNumber);
        }
        System.out.println("Web site: " + companyWebsite);
        System.out.println("Manager: " + managerFirstName + " " + managerLastName +
                " (age: " + managerAge + ", tel. " + managerPhone + ")");


    }
}
