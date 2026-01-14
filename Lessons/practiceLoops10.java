import java.util.Scanner;
public class practiceLoops10
{
  public static void main(String args[])
  {
    new practiceLoops10();
  }
  public practiceLoops10()
  {
  Scanner input = new Scanner(System.in);

  String word;
  String secretWord;
  
  do
  {
    System.out.println("please enter a woird");
    word = input.nextLine();

    System.out.println("please enter the woird again");
    secretWord = input.nextLine();

    if (!word.equals(secretWord))
    {
        System.out.println("the words do not match");
    }
  }
  while(!word.equals(secretWord));

  System.out.println("the words match");

  input.close();
 }
}
