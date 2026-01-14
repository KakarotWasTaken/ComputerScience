/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: November 27, 2025
 File Name: AmmtojBalLab5b
 Purpose: To determine the classification for grades aquired by user input, 
          based on a set range, while exiting the program is -1 is entered.
 */

import java.util.Scanner;
public class AmmtojBalLab5b
{
  public static void main(String args[])
  {
    new AmmtojBalLab5b();
  }
  public AmmtojBalLab5b()
  {
    Scanner input = new Scanner(System.in);
    // Set variable for grade, account for decimals
    double grade = 0;
    // While loop if answer does not equal to -1
    while (grade != -1)
        {
            // Ask for user input on grade, and give instructions to stop
            System.out.print("Enter student grade between 0 and 100 (type -1 to stop): ");
            grade = input.nextDouble();
            // Check user input and give appropriate response
            if (grade == -1)
            {
                System.out.println("All grades processed.");
            } 
            else if (grade < 0 || grade > 100)
            {
                System.out.println("Please enter a valid grade.");
            } 
            else if (grade >= 90)
            {
                System.out.println("Excellent.");
            }
            else if (grade >= 70 || grade == 89)
            {
                System.out.println("Good.");
            }
            else
            {
                System.out.println("Needs Improvement.");
            }
        }
    input.close();
  }
}