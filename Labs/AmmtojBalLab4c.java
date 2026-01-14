/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: November 11, 2025
 File Name: AmmtojBalLab4c
 Purpose: To determine movie ticket price based on the inputted age and time of day,
          following the 24 hour format.
 */

import java.util.Scanner;
public class AmmtojBalLab4c
{
  public static void main(String args[])
  {
    new AmmtojBalLab4c();
  }
  public AmmtojBalLab4c()
  {
    Scanner input = new Scanner(System.in);
    // Request user input for age and time of day, store the information into variable.
    System.out.println("Please enter your age: ");
    int age = input.nextInt();
    System.out.println("Please enter the time of day using the 24 hour format: ");
    int time = input.nextInt();
    // Check if age exceeds 60
    if (age >= 60)
    {
      // Check if time of day is before 5 PM
      if (time < 17)
      {
        // Calculate new ticket Price and display information
        int ticketPrice = 7-2;
        System.out.println("Your ticket price is $" + ticketPrice + ".");
      }
      // If time is not before 5 PM
      else if (time >= 17 && time <24)
      {
        // Display Ticket Price
       int ticketPrice = 7;
       System.out.println("Your ticket price is $" + ticketPrice + ".");
      }
      else
      {
        System.out.println("please enter a valid time of day following 24 hour format");
      }
    }
    // Check age range for regular admits
    else if (age >= 12 && age <60)
    {
      // Check if time of day is before 5 PM
      if (time < 17)
      {
        // Calculate new ticket Price and display information
        int ticketPrice = 10-2;
        System.out.println("Your ticket price is $" + ticketPrice + ".");
      }
      // If time is not before 5 PM
      else if (time >= 17 && time <24)
      {
       // Display Ticket Price
       int ticketPrice = 10;
       System.out.println("Your ticket price is $" + ticketPrice + ".");
      }
      else
      {
        System.out.println("please enter a valid time of day following 24 hour format");
      }
    }
    // Check age range for children
    else if (age >= 1 && age <12)
    {
      // Check if time of day is before 5 PM
      if (time < 17)
      {
        // Calculate new ticket Price and display information
        int ticketPrice = 5-2;
        System.out.println("Your ticket price is $" + ticketPrice + ".");
      }
      // If time is not before 5 PM
      else if (time >= 17 && time <24)
      {
       // Display Ticket Price
       int ticketPrice = 5;
       System.out.println("Your ticket price is $" + ticketPrice + ".");
      }
      // response if time is not within 1-24
      else
      {
        System.out.println("please enter a valid time of day following 24 hour format");
      }
    }
    // response if age is below 1
    else
    {
     System.out.println("please enter a valid age");
    }
    input.close();
  }
}
