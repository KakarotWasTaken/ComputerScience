import java.util.Scanner;
public class practiceTest5
{
  public static void main(String args[])
  {
    new practiceTest5();
  }
  public practiceTest5()
  {
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter the room temp");
    double temp = input.nextDouble();
  

  if (temp < -50 || temp > 60)
  {
   System.out.println("[please enter a valid temp]");
  }
  else if (temp < 20 || temp > 25)
  {
    System.out.println("uncomfy temp");
  }
  else 
  {
    System.out.println("comfy temp");
  }
  input.close();
  }
}
