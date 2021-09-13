package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
//Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story, creating an often silly or funny story as a result.

        //Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

        //Example Output
       // Enter a noun: dog
        //Enter a verb: walk
       // Enter an adjective: blue
       // Enter an adverb: quickly
       // Do you walk your blue dog quickly? That's hilarious!
       // Constraints
       // Use a single output statement for this program.
        //If your language supports string interpolation or string substitution, use it to build up the output.



public class App {
    public static void main(String[] args) {
        Scanner letsinput = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String this_noun = letsinput.nextLine();

        System.out.println("Enter a verb: ");
        String this_verb = letsinput.nextLine();

        System.out.println("\nEnter an adjective: ");
        String this_adjective = letsinput.nextLine();

        System.out.println("Enter an adverb: ");
        String this_adverb = letsinput.nextLine();

        System.out.println("Do you " + this_verb + " your " + this_adjective + " " + this_noun + " " + this_adverb + "? That's hilarious!");
    }
}


