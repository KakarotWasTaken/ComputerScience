/*
Summative Project - Escape Room Adventure
Name: Ammtoj Bal
File Name: AmmtojBalGameWithCommentsSummative1.java
Due Date: January 16, 2026
Purpose: To create a game using all the concepts learned in class, applying them in a creative manner.
         In this case, an escape room text-based game is created, where the user must solve puzzles to escape.
New Concepts: The number generation approach is adapted from GeeksforGeeks https://www.geeksforgeeks.org/dsa/random-list-of-m-non-negative-integers-whose-sum-is-n
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
              - The whole thing is looped 3 times to produce three sets of numbers
*/

import java.util.Scanner;
public class AmmtojBalGameWithoutCommentsSummative1
{
  public static void main(String[] args)
  {
    new AmmtojBalGameWithoutCommentsSummative1();
  }
  public AmmtojBalGameWithoutCommentsSummative1()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("=======================================");
    System.out.println(" Welcome to: Escape Room Adventure");
    System.out.println(" By: Ammtoj Bal");
    System.out.println("======================================= \n");
    System.out.println("This is a text-based escape room game. Use the menu provided to proceed.");
    clearScreen();
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
        System.out.println("Input answers when prompted.");
        System.out.println("Type '999' during puzzles to give up and quit the game anytime.");
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
        keepRunning = 41; 
      }
      System.out.println();
    }
    input.close();
  }
  public void clearScreen()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("\nPress enter to proceed:");
    input.nextLine();
    for (int i = 0; i < 67; i++) 
    {
      System.out.println();
    }
  }
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
   public void handleGame(Scanner input)
    { 
      System.out.println("\n--- Welcome to Escape Room Adventure! ---");
      System.out.println("Your goal is to solve all the puzzles and escape the room.");
      System.out.println("Type '999' during puzzles to give up and quit the game anytime.");
      System.out.println("Good luck!");
      clearScreen();
      System.out.println("You wake up in a cold, barely lit room. The faint scent of wet rocks filling the air.");
      System.out.println("Your head aches, and your memories are cloudy. You can't recall how you got here.");
      System.out.println("The sound of dripping water echoes around you, you look around, you're locked inside a labyrinth of rooms. \n");
      System.out.println("In front of you, there's a single note scribbled hastily:");
      System.out.println("\"Solve the puzzles, and earn your freedom. Fail, and this room will be your tomb.\"\n");
      System.out.println("You clutch the note tightly, determined, removing all fear from your mind.");
      System.out.println("The exepediation that took you here was a mess, but one thing is clear: ");
      System.out.println("You must escape.");
      clearScreen();
      boolean success = runPuzzles(); 
      if (success) 
      {
        System.out.println("\n--- Congratulations! --- \n");
        System.out.println("You have solved all the puzzles and escaped the room!");
        System.out.println("Your freedom is yours! Do what you will with it, adventurer.");
        clearScreen();
      } 
      else 
      {
        System.out.println("\n--- Game Over --- \n");
        System.out.println("You hear a faint voice echoing through the room: ");
        System.out.println("\"You failed to solve the final puzzle.\"");
        System.out.println("Suddenly the floor beneaath you crumbles, as you fall into darkness.\n");
        System.out.println("Youu wake up, in a similar room, but this time, there's no note.");
        System.out.println("You remain trapped in the room forever. With your fate sealed, your adventure ends here.");
        clearScreen();
      }
    }
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
    int m = 3;
    int n = 67;
    System.out.println("Three sets of numbers on the wall are: \n");
    for (int set = 0; set < 3; set++)
    {
      int[] arr = new int[m];
      for (int i = 0; i < n; i++)
      {
        int randomIndex = (int)(Math.random() * m);
        arr[randomIndex]++;
      }
      for (int number : arr)
      {
        System.out.print(number + " ");
      }
      System.out.println();
    }
    String correctAnswer1 = "67";
    String correctAnswer2 = "sixty seven";
    boolean answerLoop1 = true;
    while (answerLoop1)
    {
      System.out.println();
      System.out.print("Enter the secret integer: ");
      String answerPuzzleOne = input.nextLine().toLowerCase();
      if(answerPuzzleOne.equals("999"))
      {
        System.out.println("\nYou have chosen to quit the game. Goodbye!");
        clearScreen();
        return false; 
      }
      else if (answerPuzzleOne.equals(correctAnswer1) || answerPuzzleOne.equals(correctAnswer2))
      {
        System.out.println("\nCorrect! The iron box clicks open, revealing a key to the next door.");
        System.out.println("You've successfully opened the next door, however a wake of fog fills the room and you lose conciousness.");
        clearScreen();
        answerLoop1 = false; 
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
    System.out.printf("The product written on the note is " + String.format("%.2f", result) + ". \n");
    boolean answerLoop2 = true; 
    while (answerLoop2)
    {
      System.out.print("\nEnter the first integer: ");
      double userNum1 = input.nextDouble();
      if(userNum1 == 999)
      {
        System.out.println("\nYou have chosen to quit the game. Goodbye!");
        clearScreen();
        return false; 
      }
      System.out.print("Enter the second integer: ");
      double userNum2 = input.nextDouble();
      if(userNum2 == 999)
      {
        System.out.println("\nYou have chosen to quit the game. Goodbye!");
        clearScreen();
        return false; 
      }
      double userNum = userNum1 * userNum2; 
      input.nextLine(); 
      if (String.format("%.2f", userNum).equals(String.format("%.2f", result))) 
      {
        System.out.println("\nCorrect! The door unlocks, and you proceed to the next puzzle.");
        clearScreen();
        answerLoop2 = false; 
      }
      else
      {
        System.out.println("\nIncorrect. Try again.");
      }
    }
    System.out.println("\n--- Continuing to Puzzle 3. --- \n");
    System.out.println("You enter a new room, inscriptions all over the walls, in blood red, \"FIND THE KEY.\"");
    System.out.println("In the center of the room, there's a pedestal with a riddle with a red font inscribed on it.");
    clearScreen();
    System.out.println("--- Puzzle 3 --- \n"); 
    System.out.println("\"Amidst the chaos, the key lies hidden in plain sight.\"\n");
    String hiddenWord = "key";
    boolean answerLoop3 = true;
    while (answerLoop3)
    {
      System.out.print("Enter the secret word: ");
      String answerPuzzleThree = input.nextLine().toLowerCase(); 
      if(answerPuzzleThree.equals("999"))
      {
        System.out.println("\nYou have chosen to quit the game. Goodbye!");
        clearScreen();
        return false;
      }
      else if(answerPuzzleThree.equals(hiddenWord))
      {
        System.out.println("\n Correct! The walls rumble, and a path forward reveals itself.");
        clearScreen();
        answerLoop3 = false;
      }
      else
      {
        System.out.println("Incorrect. Try again.");
      }
    }
    System.out.println("\n--- Continuing to Puzzle 4. --- \n");
    System.out.println("A grand door reveals itself to you, with the handprints of all who came before you");
    System.out.println("A caution warns outside, \"Only the worthy may pass through. Prove your worth by solving the final riddle.\"");
    System.out.println("Another note reads: \"Try at the risk of your life, for 5 failed attempts will lead to your demise.\"");
    clearScreen();
    System.out.println("--- Puzzle 4 --- \n"); 
    System.out.println("A final riddle is inscribed on the door just above a keyboard:"); 
    System.out.println ("\n\"I am always ahead but never behind. What am I\"\n");
    String riddleAnswer = "time";
    for (int i = 1; i <= 5; i++)
    {
      System.out.print("Enter your answer (Attempt " + i + " of 5): ");
      String answerPuzzleFour = input.nextLine().toLowerCase();
      if(answerPuzzleFour.equals("999"))
      {
        System.out.println("\nYou have chosen to quit the game. Goodbye!");
        clearScreen();
        return false;
      }
      else if (answerPuzzleFour.equals(riddleAnswer))
      {
        System.out.println("Correct! The grand door opens, revealing your path to freedom.");
        clearScreen();
        return true;
      }
      else
      {
        System.out.println("Incorrect. Try again.");
      }
    }
    return false;
  }
}