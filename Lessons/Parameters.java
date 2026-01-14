/*
 Comment Shell
 Name: Ammtoj Bal
 File Name: Parameters
 Purpose: To print out a message getting input and returning
          final message with usage of methods.
 */

import java.util.Scanner;
public class Parameters
{
  // Main Method
  public static void main(String args[])
  {
    new Parameters();
  }
  // Constructor
  public Parameters()
  {
    Scanner input = new Scanner(System.in);
    //Ask for input
    System.out.println("please enter your username");
    String userName = input.nextLine(); // store info into variable
    // return username with sayHelloUser method
    sayHelloUser(userName);  //invoke method with variable/parameter
    // ask for input
    System.out.println("please enter the subtotal");
    double subtotal = input.nextDouble(); // store info into variable
    // return total with applyTax method
    applyTax(subtotal); //invoke method with variable/parameter
    
    input.close();
  }
  //sayHelloUser method
  public void sayHelloUser(String userName) //using string variable, not the same as variable in constructor
  {
    System.out.println("Hello " + userName + ".");
  }
  //applyTax method
  public void applyTax(double subtotal) //using double variable, not the same as variable in constructor
  {
    double total = subtotal*1.13;
    System.out.println("The total is $" + total + ".");
  }
}