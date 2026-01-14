import java.util.Scanner;
public class practiceLoops1
{
  public static void main(String args[])
  {
    new practiceLoops1();
  }
  public practiceLoops1()
  {
  Scanner input = new Scanner(System.in);
  
  int price = 0;

  //for loop
  for (int i = 0 ; i < 4 ; i++)
  {
    System.out.println("please enter the drink size yotu want");
    String size = input.nextLine().toLowerCase();

    if(size.equals("small") || size.equals("s"))
    {
        System.out.println("$2");
        price += 2;
    }
    else if(size.equals("medium") || size.equals("m"))
    {
        System.out.println("$3");
        price += 3;
    }
    else if(size.equals("large") || size.equals("l"))
    {
        System.out.println("$4");
        price += 4;
    }
    else
    {
        System.out.println("please enbter a valid size");
    }
  }
  System.out.println("yout toatl cost is $" + price + ".");
  input.close();
  }
}
