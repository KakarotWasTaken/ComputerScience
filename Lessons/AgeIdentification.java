/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: October 7, 2025
 File Name: AgeIdentification
 Purpose: To
 */

import java.util.Scanner;
 public class AgeIdentification
 {
 public static void main(String args[])
 {
   new AgeIdentification();
 }
 public AgeIdentification()
  {
   Scanner input = new Scanner(System.in);
   System.out.println("How old are you");
   int age = input.nextInt();

   if (age >= 65)
   {
    System.out.println("you are a senior citizen");
    System.out.println("you are the same age as my grandparent");
  }
   else if (age >= 21 && age <65)
    System.out.println("you are an adult.");
   else if (age >= 18 && age <21)
    System.out.println("you are a teen.");
   else if (age >= 0 && age <18)
    System.out.println("you are a kid.");
   else
    System.out.println("please enter a valid age");

   input.close();
  }
 }
