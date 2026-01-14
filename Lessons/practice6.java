import java.util.Scanner;
public class practice6
{
  public static void main(String[] args)
  {
    new practice6();
  }
  public practice6()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number of months: ");
    int months = input.nextInt();

    int years = months / 12;
    int remainingMonths = months % 12;

    System.out.println(months + " months is " + years + " years and " + remainingMonths + " months.");
    input.close();
  }
}
