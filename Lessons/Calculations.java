/*
 Comment Shell
 Name: Ammtoj Bal
 File Name: ReturnType
 Purpose: To 
 */

import java.util.Scanner;
public class Calculations
{
  // Main Method
  public static void main(String args[])
  {
    new Calculations();
  }
  // Constructor
  public Calculations()
  {
    Scanner input = new Scanner(System.in);

    System.out.println("please enter the width");
    double width = input.nextDouble();
    System.out.println("please enter the height");
    double height = input.nextDouble();

    double areaToPaint = area(width, height);

    System.out.println("the area is " + String.format("%.2f",  area(width, height)) + "cm^2.");
    System.out.println("the cost to paint the area given is $" + String.format("%.2f", paint(areaToPaint)) + ".");

    input.close();
  }
 public double area(double width, double height)
 {
    double area = width*height;
    return area;
 }
public double paint(double areaToPaint)
{
    double paintCost = areaToPaint*30;
    return paintCost; 
}
}