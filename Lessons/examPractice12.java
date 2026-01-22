/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

Question 12:
Write a program that takes in two integer values from the user. A method named greaterNumber determines which number is greater.
Invoke the method in the constructor to display which number is greater
 
 */

import java.util.Scanner;
public class examPractice12
{
  public static void main(String[] args)
  {
    new examPractice12();
  }
  public examPractice12()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    
    System.out.print("please enter integer number 1: ");
    int num1 = input.nextInt();
    System.out.print("please enter integer number 2: ");
    int num2 = input.nextInt();
    
    int greaterNum = greaterNumber(num1, num2);
    System.out.println("The greater number is: " + greaterNum + ".");

    input.close();
  }

  public int greaterNumber(int num1, int num2)
  {
    if (num1>num2)
    {
        return num1;
    }
    else
    {
        return num2;
    }
  }
}