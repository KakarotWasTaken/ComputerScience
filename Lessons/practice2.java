import java.util.Scanner;
public class practice2
{
  public static void main(String[] args)
  {
    new practice2();
  }
  public practice2()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the radius of your circle in cm: ");
    double radius = input.nextDouble();

    double pi = 3.14159;
    double area1;

    area1 = pi * (radius * radius);

    System.out.println("The area of your circle is " + String.format("%.2f", area1) + "cm^3");

    input.close();
  }
}
