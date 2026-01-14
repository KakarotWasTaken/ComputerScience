import java.util.Scanner;
public class practice8
{
  public static void main(String[] args)
  {
    new practice8();
  }
  public practice8()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount of days in your trip: ");
    int days = input.nextInt();

    int hours = days * 24;
    int minutes = hours * 60;

    System.out.println("your drip in hours is " + hours + ". your trip in minutes is " + minutes + ".");

  input.close();
  }
}
