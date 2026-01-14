import java.util.Scanner;
public class practiceLoops9
{
  public static void main(String args[])
  {
    new practiceLoops9();
  }
  public practiceLoops9()
  {
  Scanner input = new Scanner(System.in);

  String username;
  String confirmUsername;
  
  do
  {
    System.out.println("polease enter username");
    username = input.nextLine();
    System.out.println("please ocnfirm username");
    confirmUsername = input.nextLine();

    if (!username.equals(confirmUsername))
    {
    System.out.println("username dont match");
    }
  }
  while(!username.equals(confirmUsername));

System.out.println("username confrirmed");

  input.close();
 }
}
