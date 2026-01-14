/*
Comment Shell
Name: Ammtoj Bal
File Name: Age
Purpose: To determine a persons age and check if they 
         qualify to write their learners test, then 
         display if the user is qualified or not.
*/

import java.util.Scanner;
public class Age
{
  public static void main(String[] args)
  {
    new Age();
  }
  public Age()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    // Ask for users age
    System.out.print("Please enter your age: ");
    int userAge = input.nextInt(); // Store user input
    
    if (userAge >= 16) // Check if requirement is satisfied, if true print on 26
      System.out.println("You are now qualified to write your drivers learners test!");
    else // If false, print on 28
      System.out.println("You are not qualified to write your drivers learners test.");
    
    input.close();
  }
}