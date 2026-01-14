import java.util.Scanner;
public class practiceLoops13
{
  public static void main(String args[])
  {
    new practiceLoops13();
  }
  public practiceLoops13()
  {
  Scanner input = new Scanner(System.in);



  for (int i = 0 ; i < 5 ; i++)
    {
        System.out.println("please enter fruit type");
        String type = input.nextLine().toLowerCase();

        if (type.equals("apple"))
        {
        System.out.println("packed apples");
        }
        else if (type.equals("orange"))
        {
            System.out.println("packed oranges");
        }
        else
        {
            System.out.println("packed unlkojnwn fruit");
        }
    }  

  input.close();
 }
}
