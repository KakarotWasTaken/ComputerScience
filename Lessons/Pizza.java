  /*
   Comment Shell
   Name: Ammtoj Bal
   File Name: Pizza
   Purpose: To determine a persons if a person wants pizza, if they do
   then prompt a price of $5 and ask if they would still
   like to purchase.
   */

  import java.util.Scanner;
  public class Pizza
  {
    public static void main(String[] args)
    {
      new Pizza();
    }
    public Pizza()
    {
      // Start user input
      Scanner input = new Scanner(System.in);
      System.out.print("Would you like to purchase a slice of pizza: ");
      String initialPurchase = input.nextLine();

      // Checks if requirement is satisfied.
      if (initialPurchase.equals("Yes") || initialPurchase.equals("yes"))
        {
          System.out.println("A slice of pizza costs $5.");
          System.out.println("Good Choice!");
        }
      else
       {
        System.out.println("Goodbye!");
        System.out.println("It is good pizza! Are you sure you don’t want any?");
       }
      input.close();
    }
  }
