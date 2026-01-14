/*
 Comment Shell 
 Name: Ammtoj Bal
 Due Date: September 17, 2025
 File Name: Area
 Purpose: To calculate Area and perimeter based on given input on length and width.
 */

// Scanner inmported
import java.util.Scanner;
public class Area
{
  public static void main(String[] args)
  {
    new Area();
  }
  public Area()
  {
    // Input Started
    Scanner input = new Scanner(System.in);
    
    System.out.println("What is the width of the rectangle?");
    double width = input.nextDouble();
    System.out.println("What is the length of the rectangle?");
    double length = input.nextDouble();
    
    input.close();
    
    double area = length * width;
    double perimeter = (length + width) * 2;
    // Output
    System.out.println("");
    System.out.println("The area of the rectangle is " + String.format("%.2f", area) + "cm^2.");
    System.out.println("The perimeter of the rectangle is " + String.format("%.4f", perimeter) + "cm.");
  }
}