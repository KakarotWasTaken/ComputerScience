/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: November 11, 2025
 File Name: AmmtojBalLab4a
 Purpose: To determine Mama Bears bowl weight(the middle value of all three entered)
          and display it back to the user
 */

import java.util.Scanner;
public class AmmtojBalLab4a
{
  public static void main(String args[])
  {
    new AmmtojBalLab4a();
  }
  public AmmtojBalLab4a()
  {
    // Display question and store user prompt into relavent variable
    Scanner input = new Scanner(System.in);
    System.out.println("please enter bowl 1 weight: ");
    int bowlOne = input.nextInt();
    System.out.println("please enter bowl 2 weight: ");
    int bowlTwo = input.nextInt();
    System.out.println("please enter bowl 3 weight: ");
    int bowlThree = input.nextInt();

    // check if bowl two is the middle weight
    if (bowlOne > bowlTwo && bowlTwo > bowlThree || bowlThree > bowlTwo && bowlTwo > bowlOne)
    {
      System.out.println("The middle bowl weight, or Mama Bears bowl weight is " + bowlTwo + ".");
    }
    // check if bowl one is middle weight
    else if (bowlTwo > bowlOne && bowlOne > bowlThree || bowlThree > bowlOne && bowlOne > bowlTwo)
    {
      System.out.println("The middle bowl weight, or Mama Bears bowl weight is " + bowlOne + ".");
    }
    // check if bowl three is middle weight
    else if (bowlOne > bowlThree && bowlThree > bowlTwo || bowlTwo > bowlThree && bowlThree > bowlOne)
    {
      System.out.println("The middle bowl weight, or Mama Bears bowl weight is " + bowlThree + ".");
    }
    // if no bowls are in the middle, they are the same weight
    else
    {
      System.out.println("All bowls are the same weight.");
    }
    input.close();
  }
}
