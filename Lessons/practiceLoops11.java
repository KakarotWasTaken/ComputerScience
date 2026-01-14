import java.util.Scanner;
public class practiceLoops11
{
  public static void main(String args[])
  {
    new practiceLoops11();
  }
  public practiceLoops11()
  {
  Scanner input = new Scanner(System.in);

  String email;
  String emailConfirm;
  
  do
  {
    System.out.print("pleas enter email address: ");
    email = input.nextLine();

    System.out.print("pleas emter meial again: ");
    emailConfirm = input.nextLine();

    if (!email.equals(emailConfirm))
    {
        System.out.println("the meail adress does not match");
    }

  }
  while(!email.equals(emailConfirm));
  
  System.out.println("email confirmed");

  input.close();
 }
}
