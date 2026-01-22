/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

Question 1:
Write a program that asks the user to enter an integer value for length of a movie in minutes. The program then calculates the price
of the movie as a double. The movie costs 25 cents for every minute. Then the program displays the cost of the movie to the user. 
 
 */

import java.util.Scanner;
public class examPractice1
{
  public static void main(String[] args)
  {
    new examPractice1();    
  }
  public examPractice1()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
  
    System.out.print("please enter the length of the movie in minutes: ");
    int length = input.nextInt();

    double price = length * 0.25;

    System.out.println("the price of the movie is " + String.format("%.2f", price) + " dollars.");

    input.close();
  }
}