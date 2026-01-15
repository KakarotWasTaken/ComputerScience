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
    System.out.println("This is a text-based escape room game. Use the menu provided to proceed.");
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
        System.out.println("You wake up in a locked room. Solve puzzles to escape.");
        clearScreen();
      }
      else if (choice == 2)
      {
        handleGame(input);
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

  // Clear the screen method, simulates clearing the console by printing new lines upon user request
  public void clearScreen()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("\nPress enter to proceed:");
    input.nextLine(); // Wait for user to press enter
    // Print 15 new lines to simulate clearing the screen
    for (int i = 0; i < 15; i++) 
    {
      System.out.println();
    }
  }

  // Reads integer choice from the user in the menu and returns value
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

  // Handle game method, tells user success or failure at the end of the game, invoked another method to runs puzzles
   public void handleGame(Scanner input)
    { 
      System.out.println("\n--- Welcome to Escape Room Adventure! ---");
      System.out.println("Your goal is to solve all the puzzles and escape the room.");
      System.out.println("Good luck!");
      clearScreen();
      
      boolean success = runPuzzles(); // invoke runPuzzles method and store the result

      // Handle the final result based on success or failure
      if (success) 
      {
        System.out.println("\n--- Congratulations! --- \n");
        System.out.println("You have solved all the puzzles and escaped the room!");
      } 
      else 
      {
        System.out.println("\n--- Game Over ---");
        System.out.println("You failed to solve all the puzzles. Better luck next time!");
      }
    }

  // Run puzzles method, contains all puzzles to be ran and returns user success as a boolean value
   public boolean runPuzzles()
    {
    boolean isSuccessful = true;
    Scanner input = new Scanner(System.in);


    System.out.println("--- Let's begin with Puzzle 1. ---\n");
    System.out.println("Upon waking up, you find three sets of numbers displayed on the wall, below resides a iron box with a keypad.");
    System.out.println("Looking closer, you see a note that reads:");
    System.out.println("The key you seek is hidden within the sums of these numbers. Find that total, and it shall start your path to freedom.");
    clearScreen();

    System.out.println("--- Puzzle 1 --- \n");
    /*  
    The number generation approach is adapted from GeeksforGeeks https://www.geeksforgeeks.org/dsa/random-list-of-m-non-negative-integers-whose-sum-is-n
    1. What the concept is:
    This is a random number generator that creates an array of random integers that their sum equals a fixed number.
    2. What it is used for:
    This technique is used to generate three unique sets of three numbers, each of which sums to the set total.
    In this case, it is used for the puzzle, which asks the user to enter a secret integer based on the sum of the numbers displayed.
    The secret integer is the sum of each set, which is 67.
    3. How it was used in this program:
    - An array is initialized to store three numbers (m = 3).
    - A loop is ran for however long until the set equals n.
    - On each iteration, a random index in the array is selected and its value is increased by 1. 
    - By the end of the loop, the array contains three random integers whose sum equals `67`.
    - the whole thing is looped 3 times to produce three sets of numbers
    */ 
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
        System.out.println("\nCorrect! The iron box clicks open, revealing a key to the next door.");
        System.out.println("You've successfully opened the next door, however a wake of fog fills the room and you lose conciousness.");
        clearScreen();
        answerLoop1 = false; // Exit the loop
      }
      else
      {
        System.out.println("Incorrect. Try again.");
      }
    }

    System.out.println("\n--- Continuing to Puzzle 2. --- \n");
    System.out.println("You wake up in a new room, dimly lit with a single table in the center. On the table lies a locked box with another keypad on it.");
    System.out.println("Beside the box, there's a note that reads:");
    System.out.println("Given is a product, to obtain the key find the numbers in close relation to it.");
    System.out.println("Hint: Think multiplication.");
    clearScreen();
    System.out.println("--- Puzzle 2 --- \n"); 

    double num1 = 41.14;
    double num2 = 66.77;
    double result = num1 * num2;
    System.out.printf("The product written on the note is  " + String.format("%.2f", result) + ". \n");
    
    boolean answerLoop2 = true; // Loop until the correct answer is given
    while (answerLoop2)
    {
      System.out.print("Enter the first integer: ");
      double userNum1 = input.nextDouble();
      System.out.print("Enter the second integer: ");
      double userNum2 = input.nextDouble();
      double userNum = userNum1 * userNum2; 

      if (String.format("%.2f", userNum).equals(String.format("%.2f", result))) // Match against the rounded result
      {
        System.out.println("\nCorrect! The door unlocks, and you proceed to the next puzzle.");
        clearScreen();
        answerLoop2 = false; // Exit puzzle loop
      }
      else
      {
        System.out.println("\nIncorrect. Try again.");
      }
    }

    input.close();
    return isSuccessful;
    
  }
}