import java.util.Scanner;
public class practiceTest4
{
  public static void main(String args[])
  {
    new practiceTest4();
  }
  public practiceTest4()
  {
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter your bmi");
    double bmi = input.nextDouble();
  

  if (bmi < 0 || bmi > 100)
  {
   System.out.println("[please enter a valid bmi]");
  }
  else if (bmi >= 30)
  {
    System.out.println("you are obese");
  }
  else if (bmi >= 25 || bmi == 29.9)
  {
    System.out.println("yiy are overweight.");
  }
else if (bmi >= 18.5 || bmi == 24.9)
  {
    System.out.println("you are normal weight");
  }
  else
  {
    System.out.println("you are underwight");
  }
  
  input.close();
  }
}
