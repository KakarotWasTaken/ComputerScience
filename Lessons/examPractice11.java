/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

 Question 11:
Write a program that takes the length and width of a rectangle (both integers) from the user. A method called isSquare then
determines if the shape is a square or not. Invoke the method in the constructor and let the user know if the shape is a square or is
not a square.


 */

import java.util.Scanner;
public class examPractice11
{
  public static void main(String[] args)
  {
    new examPractice11();
  }
  public examPractice11()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    
    System.out.println("please enter thelength of the rectangel: ");
    double length = input.nextDouble();
    System.out.println("please enter the width of the rectangle: ");
    double width = input.nextDouble();

    if (isSquare(length, width))
    {
      System.out.println("The shape is a square.");
    }
    else
    {
      System.out.println("The shape is not a square.");
    }
    
    input.close();
  }

  public boolean isSquare(double length, double width)
  {
    if (length == width)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}