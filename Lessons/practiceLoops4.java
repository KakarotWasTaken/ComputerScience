import java.util.Scanner;
public class practiceLoops4
{
  public static void main(String args[])
  {
    new practiceLoops4();
  }
  public practiceLoops4()
  {
  Scanner input = new Scanner(System.in);

  //for loop
  for (int i = 0 ; i < 3 ; i++)
  {
    System.out.println("which car wash would oyu want");
    String type = input.nextLine().toLowerCase();

    if (type.equals("basic"))
    {
        System.out.println("5$ wash");
    }
    else if (type.equals("deluxe"))
    {
        System.out.println("10$ wash");
    }
    else if (type.equals("premium"))
    {
        System.out.println("15$ wash");
    }
    else
    {
        System.out.println("invaluid type");
    }
  }
  input.close();
 }
}
