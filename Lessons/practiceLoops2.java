import java.util.Scanner;
public class practiceLoops2
{
  public static void main(String args[])
  {
    new practiceLoops2();
  }
  public practiceLoops2()
  {
  Scanner input = new Scanner(System.in);

  //for loop
  for (int i = 0 ; i < 6 ; i++)
  {
    System.out.println("Please enter your age");
    int age = input.nextInt();

    if (age < 0 || age > 100)
    {
        System.out.println("pleas enter a vlaud age");
    }
    else if (age < 12)
    {
        System.out.println("child ticket");
    }
    else if (age >= 12 && age <= 64)
    {
        System.out.println("regular admit");
    }
    else
    {
        System.out.println("senior");
    }
  }

  input.close();
  }
}
