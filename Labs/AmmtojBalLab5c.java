/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: November 27, 2025
 File Name: AmmtojBalLab5c
 Purpose: To create a password by having the user enter the same password twice, 
          if they do not match then loop to try again, until it matches.
 */

import java.util.Scanner;
public class AmmtojBalLab5c
{
  public static void main(String args[])
  {
    new AmmtojBalLab5c();
  }
  public AmmtojBalLab5c()
  {
    Scanner input = new Scanner(System.in);
    // Create the variables
    String password;
    String confirmPassword;
    // Do while loop that continues until passwrods match
    do 
      {
        // Ask for user password and store input into variable
        System.out.println("Please enter your password: ");
        password = input.nextLine();
        // Ask to enter password again and store input into variable
        System.out.println("Please enter your password again: ");
        confirmPassword = input.nextLine();
        // Check if passwords dont match, then display response
        if (!password.equals(confirmPassword))
        {
            System.out.println("Passwords do not match. Please try again. \n");
        }
      }
      while (!password.equals(confirmPassword));
      // Display once passwrods match
      System.out.println("\nPassword sucessfully created.");
    input.close();
  }
}