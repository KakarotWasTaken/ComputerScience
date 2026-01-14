import java.util.Scanner;
public class practiceLoops15
{
  public static void main(String args[])
  {
    new practiceLoops15();
  }
  public practiceLoops15()
  {
  Scanner input = new Scanner(System.in);

  String word;
  String secretWord;


  do
  {
    System.out.print("please enter a passwrod: ");
    word = input.nextLine();

    System.out.print("[please enter word again: ");
    secretWord = input.nextLine();

    if (!word.equals(secretWord))
    {
        System.out.println("words do not match");
    }

  }
  while(!word.equals(secretWord));
  
  System.out.println("the words match");

  input.close();
 }
}
