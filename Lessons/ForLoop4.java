import java.util.Scanner;
public class ForLoop4
{
  public static void main(String args[])
  {
    new ForLoop4();
  }
  public ForLoop4()
  {
  Scanner input = new Scanner(System.in);

  int weeks = 3;
  int days = 7;

  //for loop
  for (int i = 1; i <= weeks; i++)
  {
    System.out.println("Week: " + i + ":");
    
    for(int a = 1; a <= days; a++)
    {
        System.out.println(" Day: " + a + ".");
    }
  }
  input.close();
  }
}
