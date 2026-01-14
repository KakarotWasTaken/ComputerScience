/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: November 11, 2025
 File Name: AmmtojBalLab4b
 Purpose: To determine the cost of international letters based on
          a set cost per letter varying by the letter range,
          collecting input from the user and determining if
          it is in the set range, then calculating how much
          it costs and display it back to the user.
 */

import java.util.Scanner;
public class AmmtojBalLab4b
{
  public static void main(String args[])
  {
    new AmmtojBalLab4b();
  }
  public AmmtojBalLab4b()
  {
    Scanner input = new Scanner(System.in);
    // Ask user how many letters, and store input into variable
    System.out.println("How many letters would you like?");
    int letterCount = input.nextInt();
    // check if letterCount is between a set price range for x-y letter range
    if (letterCount >= 20 && letterCount <39)
    {
      //store letter cost for range in variable and calculate how much all letters would cost
      int perLetterCost = 2;
      int letterCost = letterCount * perLetterCost;
      //display it back to the user
      System.out.println("The cost per letter is $2 each");
      System.out.println("The total cost is $" + letterCost + ".");
    }
    // check if letterCount is between the other set price range for x-y letter range
    else if (letterCount >= 10 && letterCount <19)
    {
      int perLetterCost = 3;
      int letterCost = letterCount * perLetterCost;
      //display it back to the user
      System.out.println("The cost per letter is $3 each");
      System.out.println("The total cost is $" + letterCost + ".");
    }
    // check if letterCount is between the other set price range for x-y letter range
    else if (letterCount >= 1 && letterCount <9)
    {
      //store letter cost for range in variable and calculate how much all letters would cost
      int perLetterCost = 5;
      int letterCost = letterCount * perLetterCost;
      //display it back to the user
      System.out.println("The cost per letter is $5 each");
      System.out.println("The total cost is $" + letterCost + ".");
    }
    // check if letterCount is between the other set price range for x-y letter range
    else if (letterCount >= 40)
    {
      //store letter cost for range in variable and calculate how much all letters would cost
      int perLetterCost = 1;
      int letterCost = letterCount * perLetterCost;
      //display it back to the user
      System.out.println("The cost per letter is $1 each");
      System.out.println("The total cost is $" + letterCost + ".");
    }
    // if any other input is entered, tell user its invalud
    else
    {
      System.out.println("please enter a valid number");
    }
    input.close();
  }
}
