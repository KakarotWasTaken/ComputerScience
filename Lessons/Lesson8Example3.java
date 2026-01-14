import java.util.Scanner;
public class Lesson8Example3
{
  public static void main(String args[])
  {
    new Lesson8Example3();
  }
  public Lesson8Example3()
  {
  Scanner input = new Scanner(System.in);

  //while loop
  int i = 2;
  while (i <= 10)
  {
    System.out.print(i +" ");
    i = i + 2;
  }

  input.close();
  }
}  
