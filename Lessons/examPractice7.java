/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

 Question 7:
Write a program that will print out the integers 1 2 3 4 5. Use for loop. 

 */

import java.util.Scanner;
public class examPractice7
{
  public static void main(String[] args)
  {
    new examPractice7();
  }
  public examPractice7()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    
    for (int i = 1; i <= 5; i++)
    {
        System.out.println(i);
    }

    
    input.close();
  }
}