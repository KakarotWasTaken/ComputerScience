/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: September 11, 2025
 File Name: ThreeDataTypes
 Purpose: To create 3 different variables (int,string,double) and assign them appropriate values, 
          then display the values to the user in a story form in 3 or 4 sentences.
 */

public class ThreeDataTypes
{ 
  public static void main(String[] args)
  {
    new ThreeDataTypes();
  }
  public ThreeDataTypes()
  {
    // Declaring Variables & Assigning Values
    // Type name = assigned value;
    String name = "Undertaker";
    int age = 154;
    double amount = 255.75;
    
    // Display info back to user in story form
    System.out.println("For 2025 Wrestlemania, I think " + name + " is going to win.");
    System.out.println("Even though he is " + age + " years old, I still think he's going to win.");
    System.out.println("Therefore, I have placed a $" + amount + " bet on him to win.");
  }
}