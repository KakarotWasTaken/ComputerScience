/*
 Comment Shell
 Name: Ammtoj Bal
 Due Date: November 4, 2025
 File Name: AnimalClassification
 Purpose: To determine animal classificatiojnh
 */

import java.util.Scanner;
public class animalClass
{
  public static void main(String[] args)
  {
    new animalClass();
  }
  public animalClass()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Is your animal a Invertebrate or Vertabrae");
    String intVert = input.nextLine();

    if (intVert.equals("Vertabrae") || intVert.equals("vertabrae"))
    {
      System.out.println("is your animal warm blooded or cold");
      String warmCold = input.nextLine();
      if (warmCold.equals("warm") || warmCold.equals("Warm") || warmCold.equals("Warm Blooded") || warmCold.equals("Warm blooded") || warmCold.equals("warm Blooded"))
        {
          System.out.println("Does your animal have feathers?");
          String feathers = input.nextLine();
          if (feathers.equals("yes") || feathers.equals("Yes") || feathers.equals("y"))
            {
              System.out.println("your animal is a bird");
            }
              else if (feathers.equals("no") || feathers.equals("No") || feathers.equals("n"))
              {
                System.out.println("your animal is a mammal");
              }
          else
          {
            System.out.println("your animal cannot be classified (invalid input");
          }
        }
      else
      {
        System.out.println("Does tour animal have scales");
        String scales = input.nextLine();
        if (scales.equals("yes") || scales.equals("Yes") || scales.equals("y"))
        {
          System.out.println("your animal is a Reptile");
        }
        else if (scales.equals("No") || scales.equals("no") || scales.equals("n"))
        {
        System.out.println("your animal is a Amphibian");
        }
        else
        {
          System.out.println("your animal cannot be classified (invalid input");
        }
      }
    }
    else
    {
      System.out.println("Does your animal have an exoskeleton");
      String exoskeleton = input.nextLine();
      if (exoskeleton.equals("yes") || exoskeleton.equals("Yes") || exoskeleton.equals("y"))
      {
        System.out.println("your animal is a arthropod");
      }
      else if(exoskeleton.equals("No") || exoskeleton.equals("no") || exoskeleton.equals("n"))
      {
        System.out.println("your animal is a mollusk");
      }
      else
      {
      System.out.println("your animal cannot be classified (invalid input");
    }
    }
    input.close();
  }
}
