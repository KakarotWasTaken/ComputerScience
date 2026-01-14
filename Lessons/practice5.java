import java.util.Scanner;
public class practice5
{
  public static void main(String[] args)
  {
    new practice5();
  }
  public practice5()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("enter a number: ");
    double num1 = input.nextDouble();
    System.out.println("enter a number: ");
    double num2 = input.nextDouble();

    double average = (num1 + num2) / 2;

    System.out.println("your average for the two numbers is " + String.format("%.2f", average) + ".");

  }
}
