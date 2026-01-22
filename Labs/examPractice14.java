/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

Question 14:
Write a program to determine the largest between two integers. The comparison is done in a method named largerNumber.
Invoke the method in the constructor to display the larger numb

 */

import java.util.Scanner;
public class examPractice14
{
  public static void main(String[] args)
  {
    new examPractice14();
  }
  public examPractice14()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    
    System.out.println("please enter the first ingeger");
    double num1 = input.nextDouble();
    System.out.println("please enter the second integer");
    double num2 = input.nextDouble();
    
    double largerNum = largerNumber(num1, num2);
    System.out.println("The larger number is: " + largerNum + ".");

    input.close();
  }

  public double largerNumber(double num1, double num2)
  {
    if(num1>num2)
    {
        return num1;
    }
    else
    {
        return num2;
    }
  }
}