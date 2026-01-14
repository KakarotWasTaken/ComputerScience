import java.util.Scanner;
public class practice7
{
  public static void main(String[] args)
  {
    new practice7();
  }
  public practice7()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter feet: ");
    int ft = input.nextInt();
    System.out.println("Enter inches: ");
    int inch = input.nextInt();

    int totalInches = (ft * 12) + inch;

    System.out.println("Your height in inches is " + totalInches + ".");

    input.close();
  }
}
