/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: September 11, 2025
 File Name: SunnyDay
 Purpose: To write a program named SunnyDay that displays the following message, 
          “It is a beautiful day outside!”, and ask the user what is their 
          favourite season, and ask how the user how much water a person is supposed 
          to drink a day
 */

// import the scanner / user input class
import java.util.Scanner;

public class SunnyDay
{
  public static void main (String[] args)
  {
    new SunnyDay();
  }
  public SunnyDay()
  {
    System.out.println("It is a beautiful day outside!");
    
    // Start the user input
    Scanner input = new Scanner(System.in);
    
    // Declare variable
    String favSeason;
    int studentNum;
    double waterDay;
    
    System.out.println("What is your favourite season?");
    favSeason = input.nextLine(); // Store user input into string favSeason.
    
    System.out.println("How many students in your class like summer?");
    studentNum = input.nextInt();
    
    System.out.println("How much water should a person drink in a day?");
    waterDay = input.nextDouble(); 
    
    
    //Closes scanner object
    input.close();
    
    System.out.println("Your favourite season is " + favSeason + ".");
    System.out.println("There are " + studentNum + " students that like summer.");
    System.out.println("A person should drink " + waterDay + " litres of water a day.");
  }
}