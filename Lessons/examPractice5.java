/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

Question 5:
Make a number guessing game where the user inputs a number between 1 – 100. The program prompts the user if the number picked by the
user is higher or lower. The program must pick a random number every time the game is run. Once the user has guessed the number,
display a message letting them know that they have guessed the number.

 */

import java.util.Scanner;
public class examPractice5
{
  public static void main(String[] args)
  {
    new examPractice5();
  }
  public examPractice5()
  {
    // Start user input
    Scanner input = new Scanner(System.in);

    int randomNum = 67;

    System.out.println("please enter a number between 1-100: ");
    int userGuess = input.nextInt();

    while(userGuess != randomNum)
    {
      if (userGuess > randomNum)
      {
        System.out.println("your guess is too high, please try agian");
        System.out.println("please enter a number between 1-100: ");
        userGuess = input.nextInt();
      }
      else
      {
        System.out.println("your guess is too low, please try agian");
        System.out.println("please enter a number between 1-100: ");
        userGuess = input.nextInt();
      }
    }
    System.out.println("congratulations! you have guessed the correct number: " + randomNum + ".");
    input.close();
  }
}