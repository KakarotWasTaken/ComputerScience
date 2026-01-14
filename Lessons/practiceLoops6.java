import java.util.Scanner;
public class practiceLoops6
{
  public static void main(String args[])
  {
    new practiceLoops6();
  }
  public practiceLoops6()
  {
  Scanner input = new Scanner(System.in);

  //for loop
  double balance = 0;

  while (balance != -1)
  {
    System.out.println("please enter bank balance");
    balance = input.nextDouble();
    if (balance == -1)
    {
    System.out.println("exiting");
    }
    else if (balance >= 10000)
    {
    System.out.println("high balance");
    }
    else if (balance >= 1000 ||balance == 9999)
    {
    System.out.println("moderate balance");
    }
    else
    {
    System.out.println("low balance");
    }
  }
  input.close();
 }
}
