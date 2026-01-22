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
    
    System.out.println("please enter your grade: ");
    double grade = input.nextDouble();

    if (grade < 0 || grade > 100)
    {
        System.out.println("invalid grade, please enter a valid number");
    }
    else if(grade > 90)
    {
      System.out.println("you should take the enriched level course.");
    }
    else if(grade > 80 || grade == 90)
    {
      System.out.println("you should take the academic level course.");
    }
    else
    {
      System.out.println("you should take the applied level course.");
    }
   
    input.close();
  }
}