/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: September 10, 2025
 File Name: Table
 Purpose: To use the functions of \t and \n for displaying certain text in the console.
 */

// Class
public class Table
{
  // Main Method
  public static void main (String[] args)
  {
    new Table();
  }
  // Constructor
  public Table()
  {
    // Print 3 sentences
    System.out.print("Hello! \n");
    System.out.print("What a \"nice\" day! ");
    System.out.println("Such a lovely day. \n");
    
    // Add spaces
    System.out.println("\n");
    
    // Print Table
    System.out.println("Days\t Count");
    System.out.println("Nice\t 23");
    System.out.println("Cold\t 26");
  }
}