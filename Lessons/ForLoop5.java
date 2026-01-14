import java.util.Scanner;
public class ForLoop5
{
  public static void main(String args[])
  {
    new ForLoop5();
  }
  public ForLoop5()
  {
  Scanner input = new Scanner(System.in);

  System.out.println("Multiplication table");
  //for loop
  for (int i = 1; i <= 9; i++)
  {
    System.out.print(i + "  ");
  }
  
  System.out.println( "\n- - - - - - - - - - - - - - -");
    
  
  for(int i = 1; i <= 9; i++)
    {
        System.out.print(i + " |");
        for(int a = 1; a <= 9; a++)
        {
          System.out.printf(  "%4d", i * a);
        }
        System.out.println(" ");
    }
  
  input.close();
  }
}
