/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: Jan 22, 2024
 File Name: examPractice1
 Purpose: 
Question 13:
Create a program that asks the user to enter a mark between 0 and 100. Write a method named studentMarks that determines and returns
what the user letter grades is. Invoke the method in the constructor to display the letter grade to the user. Use the range below to
determine what letter grade correspond to what mark.

below or equal to 25                            F
more than 25 and less than or equal to 45       E
more than 45 and less than or equal to 50       D
more than 50 and less than or equal to 60       C
more than 60 and less than or equal to 80       B
more than 80 and less than or equal to 100      A

 */

import java.util.Scanner;
public class examPractice13
{
  public static void main(String[] args)
  {
    new examPractice13();
  }
  public examPractice13()
  {
    // Start user input
    Scanner input = new Scanner(System.in);
    
    System.out.print("please enter your mark (0-100): ");
    double mark = input.nextDouble();
    
    String letterGrade = studentMarks(mark);

    System.out.println("Your letter grade is: " + letterGrade + ".");
    input.close();
  }

  public String studentMarks(double mark)
  {
    if (mark < 0 || mark > 100)
    {
        return "invalid (please enter a valid mark)";
    }
    else if (mark > 80)
    {
        return "A";
    }
    else if (mark > 60 || mark == 80)
    {
        return "B";
    }
    else if (mark > 50 || mark == 60)
    {
        return "C";
    }
    else if (mark > 45 || mark == 50)
    {
        return "D";
    }
    else if (mark > 25 || mark == 45)
    {
        return "E";
    }
    else
    {
        return "F";
    }
  }
}