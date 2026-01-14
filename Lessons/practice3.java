import java.util.Scanner;
public class practice3
{
  public static void main(String[] args)
  {
    new practice3();
  }
  public practice3()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the side length of rectangle in cm: ");
    double sideCM = input.nextDouble();

    double perimeter = sideCM * 4;

    System.out.println("The perimeter of your rectangle is " + String.format("%.2f", perimeter) + "cm");

    input.close();
  }
}
