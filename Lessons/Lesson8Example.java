import java.util.Scanner;
public class Lesson8Example
{
  public static void main(String args[])
  {
    new Lesson8Example();
  }
  public Lesson8Example()
  {
  Scanner input = new Scanner(System.in);

  //while loop
  int i = 0;
  while (i<5)
  {
    System.out.println("Hello World!");
    i++;
  }

  input.close();
  }
}
