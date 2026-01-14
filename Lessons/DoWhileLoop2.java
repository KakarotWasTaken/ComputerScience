import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class DoWhileLoop2
{
  public static void main(String args[])
  {
    new DoWhileLoop2();
  }
  public DoWhileLoop2()
  {
  Scanner input = new Scanner(System.in);

int choice;

  do
  {
    System.out.println("1. Print Hello");
    System.out.println("2. Print World");
    System.out.println("3. Exit");
    System.out.println("Enter your choice: ");
     choice = input.nextInt();

    if(choice == 1)
    {
    System.out.println("Hello");
    }
    else if(choice == 2)
    {
    System.out.println("World");
    }
    else
    {
    System.out.println("Exit");
    }
  }
  while (choice != 3);

  input.close();
  }
}
