/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: October 6, 2025
 File Name: EvenOdd
 Purpose: To determine if the number entered is even or odd, then displayed back to user.
 */

import java.util.Scanner;
public class EvenOdd
{
  public static void main(String[] args)
  {
    new EvenOdd();
  }
  public EvenOdd()
  {
    // Start user input
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter a number: ");
    int num = input.nextInt();

    if(num % 2 == 0)
      System.out.println("your numebr, " + num + " is even");
    else
      System.out.println("your number, " + num + " is odd");
    input.close();
  }
}

          // checking if remainder is 0 after division
          // System.out.println(num % 2 == 0);
          // boolean statement - true or false
