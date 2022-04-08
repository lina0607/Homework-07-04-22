package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program that receives a list of items from users and saves this to an array in your program - String[] grocery_list.
        // Print the list to the console when completed.
        // And user should be able to input the amount of items they want in the list.

        //declare variables
        String[] grocery_list = new String[4];

        Scanner scanner = new Scanner(System.in);
        String input;

        //receive input from user
        int counter = 0;

        do {
            System.out.println("please provide a name to be added or type quit to end the list:");
            input = scanner.nextLine();

            String anotherString;
            if (!input.equalsIgnoreCase("quit")){
                grocery_list[counter] = input;
                counter++;
            }

        } while (!input.equalsIgnoreCase("quit") && counter < grocery_list.length);

            for (String value : grocery_list) {
                System.out.println(value);
            }
        }
    }





