/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter y or n for the following questions.");

        System.out.println("Is the car silent when you turn the key?");
        String userInput = input.next();

        if(userInput.equals("y")){
            System.out.println("Are the battery terminals corroded?");
            userInput = input.next();

            if(userInput.equals("y")){
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                System.out.println("Replace cables and try again.");
            }
        }
        else{
            System.out.println("Does the car make a slicking noise?");
            userInput = input.next();

            if(userInput.equals("y")){
                System.out.println("Replace the battery.");
            }
            else{
                System.out.println("Does the car crank up but fail to start?");
                userInput = input.next();
                if(userInput.equals("y")){
                    System.out.println("Check spark plug connections.");
                }
                else{
                    System.out.println("Does the engine start and then die?");
                    userInput = input.next();
                    if(userInput.equals("y")){
                        System.out.println("Does your car have fuel injection?");
                        userInput = input.next();
                        if(userInput.equals("y")){
                            System.out.println("Get it in for service.");
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
