import java.util.Scanner;
public class practiceTest1
{
  public static void main(String args[])
  {
    new practiceTest1();
  }
  public practiceTest1()
  {
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter the first runners time");
    int runner1 = input.nextInt();
  System.out.println("Please enter the second runners time");
    int runner2 = input.nextInt();
   System.out.println("Please enter the third runners time");
    int runner3 = input.nextInt();

  if (runner1 < runner2 && runner2 < runner3 || runner3 < runner2 && runner2 < runner1)
  {
   System.out.println("The runner who placed second had a time of " + runner2 + " seconds");
  }
  else if(runner2 < runner1 && runner1 < runner3 || runner3 < runner1 && runner1 < runner2)
  {
    System.out.println("The runner who placed second had a time of " + runner1 + " seconds");
  }
  else if(runner2 < runner3 && runner3 < runner1 || runner1 < runner3 && runner3 < runner2)
  {
    System.out.println("The runner who placed second had a time of " + runner3 + " seconds");
  }
  else
  {
    System.out.println("All times are the same");
  }
  input.close();
  }
}
