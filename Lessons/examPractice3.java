/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

 Question 3:
 Write a program that asks the user to enter an integer value. The program calculates if the entered integer is a square number or not
 and displays it to the user.
 For example:
 16 is a square number because 4 x 4 = 16 ; 36 is a square number because 6 x 6 = 36

 */

import java.util.Scanner;
public class examPractice3
{
  public static void main(String[] args)
  {
    new examPractice3();
  }
  public examPractice3()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter an integer value: ");
    int userInt = input.nextInt();


    boolean isSquare = false;
    int squareRoot = 0;
    for (int i = 1; i <= userInt; i++)
    {
    if(i*i == userInt)
        {
           isSquare = true;
           squareRoot = i; 
        }
    }

    if (isSquare)
    {
        System.out.println("Your number is a square number with a sqaure root of " + squareRoot + ".");
    }
    else
    {
        System.out.println("your nmumber is not a square number");
    }

    input.close();
  }
  
}