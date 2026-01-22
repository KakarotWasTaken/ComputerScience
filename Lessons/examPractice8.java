/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 
Question 8:
Write a method that will calculate the area and perimeter of a rectangle. The area will be calculated in a method called
rectangleArea and will return a value. The perimeter will be calculated in a method called rectangleParimeter and will return a
value. Both methods will be invoked in the constructor to display the area and perimeter to the user. 

 */

import java.util.Scanner;
public class examPractice8
{
  public static void main(String[] args)
  {
    new examPractice8();
  }
  public examPractice8()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    
    System.out.println("please enter the length of the rectangle: ");
    double length = input.nextDouble();
    System.out.println("please enter the width of the rectangle: ");
    double width = input.nextDouble();

    double area = rectangleArea(length, width);
    double perimeter = rectanglePerimeter(length, width);

    System.out.println("the area of the rectangle is " + area + ".");
    System.out.println("the perimeter of the rectangle is " + perimeter + ".");

  
    input.close();
  }

  public double rectangleArea(double length, double width)
  {
    double area = length * width;
    return area;
  }
  public double rectanglePerimeter(double length, double width)
  {
    double perimeter = length*2+width*2;;
    return perimeter;
  }
}