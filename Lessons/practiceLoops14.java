import java.util.Scanner;
public class practiceLoops14
{
  public static void main(String args[])
  {
    new practiceLoops14();
  }
  public practiceLoops14()
  {
  Scanner input = new Scanner(System.in);

  int weight = 0;

  while (weight != -1)
  {
    System.out.print("please enter your weight: ");
    weight = input.nextInt();

    if (weight == -1)
    {
    System.out.println("exiting program");
    }
    else if (weight < 0)
    {
        System.out.println("please enter a vlaid weight");
    }
    else if (weight > 200)
    {
    System.out.println("heavy");
    }
    else if (weight >= 100 || weight == 200)
    {
        System.out.println("moderate");
    }
    else
    {
        System.out.println("light");
    }
  }

  input.close();
 }
}
