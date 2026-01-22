/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 

 Question 2:
Write a program that will ask the user for the length width and height of a rectangular prism and outputs the surface area and the
volume of the prism.
Formulas:
Area of a rectangular prism: 2(width x length + height x length + height x width)
Volume of a rectangular prism: width x height x length 

 */

import java.util.Scanner;
public class examPractice2
{
  public static void main(String[] args)
  {
    new examPractice2();
  }
  public examPractice2()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    System.out.println("please enter the length of the rectangular prism: ");
    double length = input.nextDouble();
    System.out.println("please enter the width of the rectangular prism: ");
    double width = input.nextDouble();
    System.out.println("please enter the height of the rectangular prism: ");
    double height = input.nextDouble();

    double surfaceArea = 2*(width*length+height*length+height*width);
    double volume = width*height*length;

    System.out.println("the surface area of the rectangular prism is " + String.format("%.2f", surfaceArea) + ".");
    System.out.println("the volume of the rectangular prism is " + String.format("%.2f", volume) + ".");

    input.close();
  }
}