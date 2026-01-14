import java.util.Scanner;
public class practiceTest3
{
  public static void main(String args[])
  {
    new practiceTest3();
  }
  public practiceTest3()
  {
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter the first drinks temp");
    double drink1 = input.nextDouble();
  System.out.println("Please enter the second drinks temp");
    double drink2 = input.nextDouble();
   System.out.println("Please enter the third drinks temp");
    double drink3 = input.nextDouble();

  if (drink2 > drink1 && drink1 > drink3 || drink3 > drink1 && drink1 > drink2)
  {
   System.out.println("The drink with the medium temp is drink 1 with a temp of " + drink1 + " degrees celcius.");
  }
  else if(drink1 > drink2 && drink2 > drink3 || drink3 > drink2 && drink2 > drink1)
  {
    System.out.println("The drink with the medium temp is drink 2 with a temp of " + drink2 + " degrees celcius.");
  }
  else if(drink1 > drink3 && drink3 > drink2 || drink2 > drink3 && drink3 > drink1)
  {
    System.out.println("The drink with the medium temp is drink 3 with a temp of " + drink3 + " degrees celcius.");
  }
  else
  {
    System.out.println("All drinks are the same temp");
  }
  
  input.close();
  }
}
