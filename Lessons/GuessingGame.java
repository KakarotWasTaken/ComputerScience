import java.util.Scanner;
public class GuessingGame
{
public static void main(String args[])
{
    new GuessingGame();
}
public GuessingGame()
{
Scanner input = new Scanner(System.in);

System.out.println("please guess a number: ");
int numGuess = input.nextInt();

int num = 10;

//while loop
while (numGuess != num)
{
    System.out.print("Wrong number, pick again.");
    System.out.print(" ");
    System.out.print("please guess a number: ");
    numGuess = input.nextInt();
}

System.out.println("the number is correct!");
System.out.println("the number was " + num + ".");

input.close();
}
}  
