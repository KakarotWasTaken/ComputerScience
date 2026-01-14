/*
Summative Project - Escape Room Adventure
Name: Ammtoj Bal
File Name: AmmtojBalGameWithoutCommentsSummative1.java
Due Date: January 16, 2026
Purpose:
 */

import java.util.Scanner;

public class AmmtojBalGameWithCommentsSummative1
{
  public static void main(String[] args)
  {
    new AmmtojBalGameWithCommentsSummative1();
  }
  public AmmtojBalGameWithCommentsSummative1()
  {
    Scanner input = new Scanner(System.in);

    // Show the introduction screen
    System.out.println("=======================================");
    System.out.println(" Welcome to: Escape Room Adventure");
    System.out.println(" By: Ammtoj Bal");
    System.out.println("=======================================");
    System.out.println();
    System.out.println("This is a text-based escape room game. Use the menu below to proceed (Appears in 5 seconds).");
    System.out.println();
    // Clear the introduction screen, using try, catch and thread, found online at https://www.geeksforgeeks.org/java/thread-sleep-method-in-java-with-examples/
    try 
    {
      Thread.sleep(5000); // Wait for 5 seconds before clearing
    } 
    catch (InterruptedException e) 
    {
      e.printStackTrace(); // Handle the exception (in case the thread gets interrupted)
    }
    // Print 15 new lines to simulate clearing the screen
    for (int i = 0; i < 15; i++) 
    {
      System.out.println();
    }

    // Main menu loop
    boolean keepRunning = true;
    while (keepRunning)
    {
      System.out.println("--- Main Menu ---");
      System.out.println("1. Read the instructions on how to play");
      System.out.println("2. Play the game");
      System.out.println("3. Quit the game");
      System.out.println();
      System.out.print("Enter your choice (1-3): ");
      int choice = getMenuChoice(input);

      System.out.println();
      if (choice == 1)
      {
        System.out.println("--- Instructions ---");
        System.out.println("You wake up in a locked room. Solve puzzles to escape.");
        System.out.println();
        System.out.print("Press Enter to return to the Main Menu...");
        input.nextLine();
      }
      else if (choice == 2)
      {
        System.out.println("Game not implemented yet. Returning to menu.");
      }
      else if (choice == 3)
      {
        System.out.println("--- Quit ---");
        System.out.println("Thank you for trying Escape Room Adventure. Goodbye!");
        keepRunning = false;
      }
      System.out.println();
    }
    input.close();
  }
  // Reads integer choice from the user and returns value
  public int getMenuChoice(Scanner input)
  {
    while (true)
    {
      String menuChoice = input.nextLine().toLowerCase();
      if (menuChoice.equals("1") || menuChoice.equals("one"))
      {
        return 1;
      }
      else if (menuChoice.equals("2") || menuChoice.equals("two"))
      {
        return 2;
      }
      else if (menuChoice.equals("3") || menuChoice.equals("three"))
      {
        return 3;
      }
      else
      {
        System.out.print("Invalid choice. Please enter 1, 2 or 3: ");
      }
    }
  }

}