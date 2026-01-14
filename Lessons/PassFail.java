/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: October 7, 2025
 File Name: PassFail
 Purpose: To determine a persons if user passes or fails depending on input grade
 */

import java.util.Scanner;
public class PassFail
{
  public static void main(String[] args)
  {
    new PassFail();
  }
  public PassFail()
  {
    // Start user input
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter your grade: ");
    int grade = input.nextInt();



    if (grade == 100)
    {
      System.out.println("perfect grade");
      System.out.println("yay");
    }
    else if (grade >= 80 && grade <100)
      System.out.println("level 4");
    else if (grade >= 50 && grade <80)
      System.out.println("you need some extra help, you passed thoguh");
    else if (grade >= 0 && grade <50)
      System.out.println("fail");
    else
    {
      System.out.println("please enter vlaud grade");
      System.out.println("1 and 100");
    }

    input.close();
  }
}
