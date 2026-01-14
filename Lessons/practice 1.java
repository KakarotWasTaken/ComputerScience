import java.util.Scanner;

public class practice1
{
  public static void main(String[] args)
  {
    new practice1();
  }
  public practice1()
  {
    Scanner input = new Scanner(System.in);

    System.out.println("What is the base of the triagnle in cm; ");
    double baseCm = input.nextDouble();
    System.out.println("What is the height of the triagnle in cm; ");
    double heightCm = input.nextDouble();

    double area;

    area = 0.5 * baseCm * heightCm;

    System.out.println("the area of your triangle is " + String.format("%.2f", area) + " cm^3");

    input.close();
  }
}
