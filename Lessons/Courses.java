/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: September 9, 2025
 File Name: Courses
 Purpose: To display the 4 courses I am taking this semester, each on a seperate line.
 */

// Class created
public class Courses
{
  // Main method created
  public static void main (String[] args)
  {
    new Courses();
  } 
  // Constructor Created
  public Courses()
  {
    // Print to the console 
    System.out.print("ICS3U:\t Introduction to \"Computer\" Programming. \n");
    System.out.println("BAF3M0: Financial Accouting Fundamental.");
    System.out.println("CLU3M0: Understanding Canadian Law.");
    System.out.println("SCH3U0: \\Chemistry.");
    
    // Print to console - Display the Text using \t and \n
    System.out.println("");
    System.out.println("\n");
    System.out.print("Ryan \t 123456 \t Sept 10 \n");
    System.out.println("Sarah \t 789058 \t Sept 11");
  }
}