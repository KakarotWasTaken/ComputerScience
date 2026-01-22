/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

Question 6:
Write a program that will add all the numbers from 1 to integer targetNum and output it. User will enter the target number. Use for
loop. 

 */

import java.util.Scanner;
public class examPractice6
{
  public static void main(String[] args)
  {
    new examPractice6();
  }
  public examPractice6()
  {
    // Start user input
    Scanner input = new Scanner(System.in);

    int sum = 0;
    int targetNum = 5;
    for(int i = 1; i <= targetNum; i++)
    {
        sum = sum + i;
    }
    System.out.println("the sum of all numbers from 1-targetnum is " + sum + ".");
    
    input.close();
  }
}