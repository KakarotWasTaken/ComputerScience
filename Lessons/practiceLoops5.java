import java.util.Scanner;
public class practiceLoops5
{
  public static void main(String args[])
  {
    new practiceLoops5();
  }
  public practiceLoops5()
  {
  Scanner input = new Scanner(System.in);

  //for loop
  for (int i = 0 ; i < 5 ; i++)
  {
    System.out.println("please enter a tempeurature");
    double temp = input.nextDouble();

    if (temp > 100)
    {
        System.out.println("too hot! ");
    }
    else if (temp < 32)
    {
        System.out.println("too cold");
    }
    else
    {
        System.out.println("normal range");
    }
  }
  input.close();
 }
}
