import java.util.Scanner;
public class Lesson8Example2
{
  public static void main(String args[])
  {
    new Lesson8Example2();
  }
  public Lesson8Example2()
  {
  Scanner input = new Scanner(System.in);

  //while loop
  int i = 1;
  while (i <= 5)
  {
    System.out.print(i +" ");
    i = i + 1;
  }

  input.close();
  }
}  
