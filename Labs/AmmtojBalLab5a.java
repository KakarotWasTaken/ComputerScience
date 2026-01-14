/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: November 27, 2025
 File Name: AmmtojBalLab5a
 Purpose: To determine the discount requires based on user 
          input for their preferred ice cream flavour.
 */

import java.util.Scanner;
public class AmmtojBalLab5a
{
  public static void main(String args[])
  {
    new AmmtojBalLab5a();
  }
  public AmmtojBalLab5a()
  {
    Scanner input = new Scanner(System.in);
    // For loop to process 5 orders
    for (int order = 1; order <= 5; order++) 
      {
        // Ask for flavour for specified order and store value into variable
        System.out.print("Enter flavor for order " + order + ": ");
        String flavour = input.nextLine().toLowerCase();  
        // Check flavour and apply according discount
        if (flavour.equals("vanilla"))
        {
            System.out.println("10% discount applied!");
        } 
        else if (flavour.equals("chocolate"))
        {
            System.out.println("5% discount applied!");
        } 
        else 
        {
            System.out.println("No discount.");
        }
      }
    input.close();
  }
}