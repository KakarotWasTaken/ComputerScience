import java.util.Scanner;
public class practiceLoops12
{
  public static void main(String args[])
  {
    new practiceLoops12();
  }
  public practiceLoops12()
  {
  Scanner input = new Scanner(System.in);

    int price = 0;


  for (int i = 0 ; i < 4 ; i++)
    {
    System.out.print("please enter drink siez: ");
    String size = input.nextLine().toLowerCase();

    if (size.equals("large"))
    {
        System.out.println("$4");
        price = price + 4;
    }
    else if (size.equals("medium"))
    {
        System.out.println("$3");
        price = price + 3;
    }
    else if (size.equals("small"))
    {
        System.out.println("$2");
        price = price + 2;
    }
    }  
    System.out.println("the total cost is " + price +  ".");
  input.close();
 }
}
