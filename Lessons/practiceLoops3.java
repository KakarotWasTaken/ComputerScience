import java.util.Scanner;
public class practiceLoops3
{
  public static void main(String args[])
  {
    new practiceLoops3();
  }
  public practiceLoops3()
  {
  Scanner input = new Scanner(System.in);

  //for loop
  for (int i = 0 ; i < 5 ; i++)
  {
    System.out.println("pelase neter your fruit");
    String fruit = input.nextLine().toLowerCase();
  
    if (fruit.equals("apple"))
    {
        System.out.println("packed apples");
    }
    else if(fruit.equals("orange"))
    {
        System.out.println("packed oranges");
    }
    else
    {
        System.out.println("inklnpown fruit");
    }
  }
  input.close();
 }
}
