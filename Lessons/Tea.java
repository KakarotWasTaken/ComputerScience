/*
 Comment Shell
 Name: Ammtoj Bal
 File Name: Tea
 Purpose: To
 */

import java.util.Scanner;
public class Tea
    {
      public static void main(String args[])
    {
      new Tea();
    }
      public Tea()
      {
        Scanner input = new Scanner(System.in);
        System.out.println("How many spoons of sugar do you take in your cha?");
        int chaSugar = input.nextInt();

        if (chaSugar >= 5)
        {
          System.out.println("Diabetes is around the corner!");
          System.out.println("Reduce the amount of sugar in Cha!");
          System.out.println("Eat something sweet with your Cha instead!");
        }
        else
        {
          System.out.println("Alright, enjoy your cha!");
        }
        input.close();
      }
 }
