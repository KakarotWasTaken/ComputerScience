import java.util.Scanner;
public class practiceTest2
{
  public static void main(String args[])
  {
    new practiceTest2();
  }
  public practiceTest2()
  {
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter the first towers hegiht");
    int tower1 = input.nextInt();
  System.out.println("Please enter the second towers hegiht");
    int tower2 = input.nextInt();
   System.out.println("Please enter the third towers hegiht");
    int tower3 = input.nextInt();

  if (tower1 > tower2 && tower1 > tower3)
  {
   System.out.println("The heighest tower sheight is tower 1 with a height of  " + tower1 + ".");
  }
  else if(tower2 > tower1 && tower2 > tower3)
  {
    System.out.println("The heighest tower sheight is tower 2 with a height of  " + tower2 + ".");
  }
  else if(tower3 > tower1 && tower3 > tower2)
  {
    System.out.println("The heighest tower sheight is tower 3 with a height of  " + tower3 + ".");
  }
  else
  {
    System.out.println("All towers are the same height");
  }
  
  input.close();
  }
}
