/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: November 11, 2025
 File Name: AmmtojBalLab4d
 Purpose: To determine a letter grade for the user based based on
          their percentage, however only using the OR (||) operator.
 */

import java.util.Scanner;
public class AmmtojBalLab4d
{
  public static void main(String args[])
  {
    new AmmtojBalLab4d();
  }
  public AmmtojBalLab4d()
  {
    Scanner input = new Scanner(System.in);
    // Ask for user input
    System.out.print("Enter your grade percentage (0–100): ");
    int grade = input.nextInt();

    // eliminate invalid inputs
    if (grade < 0 || grade > 100)
    {
      System.out.println("Invalid input. Please enter a value between 0 and 100.");
    }
    // check if grade is above 90
    else if (grade >= 90)
    {
      System.out.println("Your grade is: A");
    }
    // check if grade is above 80 or equal to 89
    else if (grade >= 80 || grade == 89)
    {
      System.out.println("Your grade is: B");
    }
    //  check if grade is above 80 or equal to 89
    else if (grade >= 70 || grade == 79)
    {
      System.out.println("Your grade is: C");
    }
    // check if grade is above 60 or equal to 69
    else if (grade >= 60 || grade == 69)
    {
      System.out.println("Your grade is: D");
    }
    // any other input is below 60
    else
    {
      System.out.println("Your grade is: F");
    }
    input.close();
  }
}
