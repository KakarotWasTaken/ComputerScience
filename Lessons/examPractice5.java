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


    int randomNum = 3;

    System.out.println("please pick a number between 1 and 100: ");
    int userNum = input.nextInt();

    while (userNum != randomNum)
    {
        if (userNum > randomNum)
        {
            System.out.println("your number is higher than the random number, please pick again: ");
            userNum = input.nextInt();
        }
        else
        {
            System.out.println("your number is lower than the random number, please pick again:");
            userNum = input.nextInt();
        }
    }
    System.out.println("congratulations! you have guessed the number!");
    input.close();
  }
}