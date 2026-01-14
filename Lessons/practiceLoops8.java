import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class practiceLoops8
{
  public static void main(String args[])
  {
    new practiceLoops8();
  }
  public practiceLoops8()
  {
  Scanner input = new Scanner(System.in);

  //variable
  int score = 0;
    
  while (score != -1 )
  {
   System.out.println("pelas enter score");
   score = input.nextInt();

   if (score == -1)
   {
   System.out.println("exiting");
   }
   else if (score < 0)
   {
   System.out.println("enter valid input");
   }
   else if (score >= 95)
   {
   System.out.println("outstanding");
   }
   else if (score >= 75 || score == 94)
   {
   System.out.println("mdoerate");
   }
   else
    {
    System.out.println("below average");
   }
  }
  input.close();
 }
}
