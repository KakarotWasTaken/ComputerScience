import java.util.Scanner;
public class ForLoop1
{
  public static void main(String args[])
  {
    new ForLoop1();
  }
  public ForLoop1()
  {
  Scanner input = new Scanner(System.in);

  //for loop
  for (int i = 1; i <= 5; i++)
  {
    System.out.println("Hello World!");
  }

  input.close();
  }
}
