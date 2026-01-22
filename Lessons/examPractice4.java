/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

 Question 4:
 Write a course recommendation program. There are three levels, applied, academic, and
 enriched. Set a grade range for each, and for every mark that the user inputs, recommend a level for them. You as a programmer pick
 what range of marks is considered as applied, academic, and enriched. 

 */

import java.util.Scanner;
public class examPractice4
{
  public static void main(String[] args)
  {
    new examPractice4();
  }
  public examPractice4()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter your mark (0-100): ");
    double mark = input.nextDouble();

    if (mark > 100 || mark < 0)
    {
        System.out.println("please enter a vlaid markl");
    }
    else if (mark > 90)
    {
        System.out.println("We reccomend you to take enriched level courses.");
    }
    else if (mark >= 80 || mark == 90)
    {
        System.out.println("We reccomend you to take academic level courses.");
    }
    else 
    {
        System.out.println("We reccomend you to take applied level courses.");
    }
    input.close();
  }
}