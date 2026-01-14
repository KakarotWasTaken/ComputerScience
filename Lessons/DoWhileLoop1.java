import java.util.Scanner;
public class DoWhileLoop1
{
  public static void main(String args[])
  {
    new DoWhileLoop1();
  }
  public DoWhileLoop1()
  {
  Scanner input = new Scanner(System.in);

  int i = 1;

  do
  {
    System.out.print(i + " ");
    i++;
  }
  while (i <= 5);

  input.close();
  }
}
