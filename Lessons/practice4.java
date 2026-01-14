import java.util.Scanner;
public class practice4
{
  public static void main(String[] args)
{
  new practice4();
}
public practice4()
{
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a number please to be squared and cubed: ");
  double num = input.nextDouble();

  double square = num * num;
  double cube = num * num * num;

  System.out.println("Your number squared is: " + String.format("%.2f", square) + ". Your number cubed is: " + String.format("%.2f", cube) + ".");

  input.close();
}
}
