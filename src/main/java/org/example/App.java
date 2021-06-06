/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter C to convert from Fahrenheit to Celsius.");
        System.out.println("Enter F to convert from Celsius to Fahrenheit.");

        String choice = input.nextLine();

        System.out.println("Your choice: " + choice);

        if(choice.equals("C") || choice.equals("c")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int temp = parseInt(input.nextLine());
            double celsius = (temp - 32) * 5 / 9;

            System.out.println("The temperature in Celsius is " + (int)celsius);

        }else if(choice.equals("F") || choice.equals("f")) {
            System.out.print("Please enter the temperature in Celsius: ");
            int temp = parseInt(input.nextLine());
            double fahrenheit = (temp * 9 / 5) + 32;

            System.out.println("The temperature in Fahrenheit is " + (int)fahrenheit);
        }
    }
}
