/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

 Question 9:
Write a program that ask the user for 3 courses and then it calculates the average in a method, calculateAverage, that will also
return an integer value, for calculating the average of 3 courses that are entered by the user. Invoke the method in the constructor
to display the average. 

 */

import java.util.Scanner;
public class examPractice9
{
  public static void main(String[] args)
  {
    new examPractice9();
  }
  public examPractice9()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    
    System.out.print("please enter your grade for the first course: ");
    double course1 = input.nextDouble();
    System.out.print("please enter your grade for the second course: ");
    double course2 = input.nextDouble();
    System.out.print("please enter your grade for the third course: ");
    double course3 = input.nextDouble();

    double averageGPA = calculateAverage(course1, course2, course3);
    System.out.println("The average grade is: " + String.format("%.2f", averageGPA) + ".");
    
    input.close();
  }

  public double calculateAverage(double course1, double course2, double course3)
  {
    double average = (course1 + course2 + course3) / 3;
    return average;
  }
}