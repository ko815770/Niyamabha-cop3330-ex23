package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App
{
    public static void main( String[] args )
    {
        String in;
        System.out.println("Is the car silent when you turn the key? y for yes, n for no");
        Scanner input = new Scanner(System.in);
        in = input.nextLine();
        if ("y".equals(in))
        {
            System.out.println("Are the battery terminals corroded?");
            in = input.nextLine();
            if ("y".equals(in))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cables and try again");
            }
        }
        else
        {
            System.out.println("Does the car make a slicking noise?");
            in = input.nextLine();
            if ("y".equals(in))
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                System.out.println("Does the car crank up but fail to start?");
                in = input.nextLine();
                if ("y".equals(in))
                {
                    System.out.println("Check the spark plug connections");
                }
                else
                {
                    System.out.println("Does the car start and then die?");
                    in = input.nextLine();
                    if ("y".equals(in))
                    {
                        System.out.println("Does your car have fuel injection?");
                        in = input.nextLine();
                        if ("y".equals(in))
                        {
                            System.out.println("Get it in for service.");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}