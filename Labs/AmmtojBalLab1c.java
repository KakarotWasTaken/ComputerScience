/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: September 25, 2025
 File Name: AmmtojBalLab1c
 Purpose: To display the participants distance needed to run to burn
          the amount of calories they ate through pieces of cake
          using variables and math.
 */

import java.util.Scanner;
public class AmmtojBalLab1c
{
  public static void main(String[] args)
  {
    new AmmtojBalLab1c();
  }
  public AmmtojBalLab1c()
  {
    // Store calories values into variables
    int cakeCals = 225;
    int kmCals = 100;
    
    // Start user input
    Scanner input = new Scanner(System.in);
    
    // Prompt user question and store input into variable
    System.out.println("How many pieces of cake have you ate? ");
    int piecesCake = input.nextInt();
    
    // Calculate total distance needed to jog.
    int totalCalsAte = cakeCals * piecesCake;
    double distanceToJog = totalCalsAte / kmCals;
    
    // Output total distance needed to jog in a nicely formatted manner.
    System.out.println("Congratulations! You now have to jog " + String.format("%.2f", distanceToJog) + " km to burn off all the calories you just ate.");
    
    input.close(); // Close user input
  }
}
