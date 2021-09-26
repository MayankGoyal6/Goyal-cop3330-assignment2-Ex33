/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 33
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;
import java.util.Random;

public class Main 
{
  public static void main(String[] args) 
  {
       
    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    String[] responses = {"Yes","No","Maybe","Ask again later"};
          
    System.out.println("What's your question?");
    String inputQuestion = scanner.nextLine();

    int randomResponseIndex = random.nextInt(responses.length);
    
    String response = responses[randomResponseIndex];
      
    System.out.println();
    System.out.println(response);
    System.out.println();
  }
}