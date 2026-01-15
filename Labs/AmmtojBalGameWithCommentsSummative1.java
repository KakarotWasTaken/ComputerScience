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
    System.out.println("======================================= \n");
    System.out.println("This is a text-based escape room game. Use the menu below to proceed (Appears soon). \n");
    clearScreen();

    // Main menu loop
    int keepRunning = 0;
    while (keepRunning != 41)
    {
      System.out.println("--- Main Menu --- \n");
      System.out.println("1. Read the instructions on how to play");
      System.out.println("2. Play the game");
      System.out.println("3. Quit the game \n");
      System.out.print("Enter your choice (1-3): ");
      int choice = getMenuChoice(input);

      System.out.println();
      if (choice == 1)
      {
        System.out.println("--- Instructions ---");
        System.out.println("You wake up in a locked room. Solve puzzles to escape. \n");
        System.out.print("Press Enter to return to the Main Menu...");
        input.nextLine();
        clearScreen();
      }
      else if (choice == 2)
      {
        startGame(input);
      }
      else if (choice == 3)
      {
        System.out.println("--- Quit ---");
        System.out.println("Thank you for trying Escape Room Adventure. Goodbye!");
        keepRunning = 41; // Exit the loop to quit the game
      }
      System.out.println();
    }
    input.close();
  }


  public void clearScreen()
  {
    // Clear the screen method, using try, catch and thread, found online at https://www.geeksforgeeks.org/java/thread-sleep-method-in-java-with-examples/
    try 
    {
      Thread.sleep(5000); // Wait for 2.5 seconds before clearing
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
  // Start game method
   public void startGame(Scanner input)
    { 
        System.out.println("--- Welcome to the Game! ---");
        System.out.println("Let's begin with Puzzle 1... \n");
        System.out.println("Upon waking up, you find three sets of numbers displayed on the wall, below resides a iron box with a keypad.");
        System.out.println("Looking closer, you see a note that reads:");
        System.out.println("The key you seek is hidden within the sums of these numbers. Find that total, and it shall start your path to freedom.");
        clearScreen();
        System.out.println("--- Puzzle 1 --- \n");
        // Generate the three sets of numbers that sum to 67
        // The number generation approach is adapted from GeeksforGeeks https://www.geeksforgeeks.org/dsa/random-list-of-m-non-negative-integers-whose-sum-is-n
        int m = 3; // Three numbers per set
        int n = 67; // Target sum per set
        System.out.println("Three sets of numbers on the wall are:");

        for (int set = 0; set < 3; set++)
        {
            int[] arr = new int[m];
            for (int i = 0; i < n; i++)
            {
                int randomIndex = (int)(Math.random() * m); // Generate random index
                arr[randomIndex]++; // Increment random index
            }
            for (int number : arr)
            {
                System.out.print(number + " ");
            }
            System.out.println(); // Move to the next line after printing a set
        }
        // Prompt user for input
        String correctAnswer1 = "67";
        String correctAnswer2 = "sixty seven";
        boolean answerLoop1 = true;
        while (answerLoop1)
        {
            System.out.println();
            System.out.print("Enter the secret integer: ");
            String answer = input.nextLine().toLowerCase();
            if (answer.equals(correctAnswer1) || answer.equals(correctAnswer2))
            {
                System.out.println("Correct! The iron box clicks open, revealing a key to the next door.");
                System.out.println("You've successfully opened the next door, however a wake of fog fills the room and you lose conciousness. \n");
                clearScreen();
                answerLoop1 = false; // Exit the loop
            }
            else
            {
                System.out.println("Incorrect. Try again.");
            }
        }
       
       
       
        // Proceed to the menu after puzzle completion, prompt second puzzle or return to main menu.
        int validChoice = 0;
        while (validChoice != 41)
        {
          System.out.println("\nWhat would you like to do next?");
          System.out.println("1. Continue to the next puzzle");
          System.out.println("2. Return to Main Menu");
          System.out.print("Enter your choice (1 or 2): ");
          String choice = input.nextLine().toLowerCase();

          if (choice.equals("1") || choice.equals("one"))
          {
            System.out.println("\n--- Continuing to the next puzzle... ---");
            clearScreen();
            System.out.println("You wake up in a new room, dimly lit with a single table in the center. On the table lies a locked box with another keypad on it.");
            System.out.println("Beside the box, there's a note that reads:");
            System.out.println("Given is a product, to obtain the key find the numbers in close relation to it.");
            System.out.println("Hint: Think multiplication.");
            clearScreen();
            System.out.println("--- Puzzle 2 ---"); 

            double num1 = 41.14;
            double num2 = 66.77;
            double result = num1 * num2;
            System.out.printf("The product written on the note is  " + String.format("%.2f", result) + ".");
            
            boolean answerLoop2 = true; // Loop until the correct answer is given
            while (answerLoop2)
            {
                System.out.print("\nEnter the first integer: ");
                double userNum1 = input.nextDouble();
                System.out.print("Enter the second integer: ");
                double userNum2 = input.nextDouble();
                System.out.println();
                double userNum = userNum1 * userNum2; 

                if (String.format("%.2f", userNum).equals(String.format("%.2f", result))) // Match against the rounded result
                {
                    System.out.println("\nCorrect! The door unlocks, and you proceed to the next puzzle.\n");
                    answerLoop2 = false; // Exit puzzle loop
                }
                else
                {
                    System.out.println("\nIncorrect. Try again.");
                }
            }
          }
          else if (choice.equals("2") || choice.equals("two"))
          {
            System.out.println("\n--- Returning to Main Menu... ---");
            clearScreen();
            validChoice = 41; // Exit the loop (return to main menu)
          }
          else
          {
            System.out.println("Invalid choice. Please enter 1 or 2.");
          }
        }
    }

}