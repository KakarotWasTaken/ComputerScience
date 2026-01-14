/*
 Comment Shell
 Name: Ammtoj Bal
 File Name: ReturnType
 Purpose: To 
 */

import java.util.Scanner;
public class ReturnType
{
  // Main Method
  public static void main(String args[])
  {
    new ReturnType();
  }
  // Constructor
  public ReturnType()
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("please enter the price for breakfast");
    double breakfast = input.nextDouble();
    System.out.println("please enter the price for lunch");
    double lunch = input.nextDouble();
    System.out.println("please enter the price for dinner");
    double dinner = input.nextDouble();
    
    double foodCost = foodOrder(breakfast, lunch, dinner);
    
    System.out.println("the total cost after taxes is " + applyTax(foodCost) + ".");
    
    input.close();
  }
  public double foodOrder(double breakfast, double lunch, double dinner)
  {
    double total = breakfast + lunch + dinner;
    return total;
  }
  public double applyTax(double foodCost)
  {
    double grandTotal = foodCost*1.13;
    return grandTotal;
  }
}