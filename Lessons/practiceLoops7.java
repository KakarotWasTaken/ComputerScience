import java.util.Scanner;
public class practiceLoops7
{
  public static void main(String args[])
  {
    new practiceLoops7();
  }
  public practiceLoops7()
  {
  Scanner input = new Scanner(System.in);

  //for loop
  
  double speed = 1;
    
  while (speed != 0)
  {
    System.out.println("pleas enter your speed");
    speed = input.nextDouble();

    if (speed == 0)
    {
        System.out.println("exiting program");
    }
    else if (speed < 0)
    {
        System.out.println("please enter a vlid speed");
    }
    else if (speed > 80)
    {
        System.out.println("too fast");
    }
    else if (speed >= 40 || speed == 80)
    {
        System.out.println("normal speed");
    }
    else if (speed < 40)
    {
        System.out.println("too slow");
    }
  }
  input.close();
 }
}
