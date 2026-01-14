import java.util.Scanner;
public class ForLoop3
{
  public static void main(String args[])
  {
    new ForLoop3();
  }
  public ForLoop3()
  {
  Scanner input = new Scanner(System.in);

  //for loop
  System.out.println("Week 1:");
  for (int i = 1; i <= 7; i++)
  {
    
    System.out.println(" Day: " + i + ".");
  }

  System.out.println("Week 2:");
  for (int i = 1; i <= 7; i++)
  {
    
    System.out.println(" Day: " + i + ".");
  }

  System.out.println("Week 3:");
  for (int i = 1; i <= 7; i++)
  {
    
    System.out.println(" Day: " + i + ".");
  }

  input.close();
  }
}
