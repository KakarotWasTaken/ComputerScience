/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: September 25, 2025
 File Name: AmmtojBalLab1b
 Purpose: To prompt the user with information regarding their favourite
          foods at a specific restaurant with the price and who they
          go with included, then display the information back
          to participant in properly formatted sentences with
          the price calculated with 13% HST.
 */

import java.util.Scanner;
public class AmmtojBalLab1b
{
  public static void main (String[] args)
  {
    new AmmtojBalLab1b();
  }
  public AmmtojBalLab1b()
  {
    // User input started
    Scanner input = new Scanner(System.in);
    
    // Ask a series of questions and store their information into a variable
    System.out.println("What is your favourite restaurant?");
    String favRestaurant = input.nextLine();
    System.out.println("Who do you take with you to this resturant?");
    String peopleTaken = input.nextLine();
    System.out.println("What is your favourite food at this restaurant?");
    String favFood = input.nextLine();
    System.out.println("How much does this food cost? ");
    Double foodCost = input.nextDouble();
    System.out.println("How many days in a month on average do you visit this restaurant?");
    int frequency = input.nextInt();
    
    input.close(); // Close user input
    
    // Do math for the output
    double foodCostHst = foodCost * 1.13;
    double foodCostHstMonthly = foodCostHst * frequency;
    
    // Output the information given in a nicely formatted manner.
    System.out.println("You favourite restaurant is " + favRestaurant + ". To this restaurant, you take " + peopleTaken + " with you.");
    System.out.println("With your " + peopleTaken + ", you each enjoy your favourite food at this restaurant, " + favFood + ".");
    System.out.println("It seems that you enjoy hurting your wallet, as you spend $" + String.format("%.2f", foodCostHst) + " very frequently, specifically " + frequency + " times a month.");
    System.out.println("What's extremely funny is that you complain about not saving money, however you spend on average $" + String.format("%.2f", foodCostHstMonthly) + " every month.");
  }
}
