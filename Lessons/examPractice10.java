/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

Question 10:
Write a program that asks the user for 5 marks between 0 and 100 for math, science, art, computer science, and history. Write a
method userPassFail which determines if the user has a passed each course and will display which course the user has passed and which
course the user have failed. Then write another method called userAverage, which will determine the average of the 5 marks entered by
the user and return the average. Invoke both methods in the constructor to display what courses the user have passed and what their
final average is. 

 */

import java.util.Scanner;
public class examPractice10
{
  public static void main(String[] args)
  {
    new examPractice10();
  }
  public examPractice10()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    
    System.out.println("please enter your mark for math (0-100): ");
    double math = input.nextDouble();
    System.out.println("please enter your mark for science (0-100): ");
    double science = input.nextDouble();
    System.out.println("please enter your mark for art (0-100): ");
    double art = input.nextDouble();
    System.out.println("please enter your mark for computer science (0-100): ");
    double computerScience = input.nextDouble();
    System.out.println("please enter your mark for history (0-100): ");
    double history = input.nextDouble();

    userPassFail(math, science, art, computerScience, history);
    double averageGPA = userAverage(math, science, art, computerScience, history);
    
    System.out.println("Your average grade is across all courses is: " + String.format("%.2f", averageGPA) + ".");

    input.close();
  }

  public void userPassFail(double math, double science, double art, double computerScience, double history)
  {
    if (math >= 50)
    {
        System.out.println("you have passed math");
    }
    else
    {
        System.out.println("you have failed math");
    }

    if (science >= 50)
    {
        System.out.println("you have passed science");
    }
    else
    {
        System.out.println("you have failed science");
    }
    
    if (art >= 50)
    {
        System.out.println("you have passed art");
    }
    else
    {
        System.out.println("you have failed art");
    }

    if (computerScience >= 50)
    {
        System.out.println("you have passed computer science");
    }
    else
    {
        System.out.println("you have failed computer science");
    }

    if (history >= 50)
    {
        System.out.println("you have passed history");
    }
    else
    {
        System.out.println("you have failed history");
    }
  }

  public double userAverage(double math, double science, double art, double computerScience, double history)
  {
    double average = (math + science + art + computerScience + history) / 5;
    return average;
  }

}