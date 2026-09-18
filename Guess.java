import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        
       Random random = new Random();
       int number = random.nextInt(100) + 1;
   
       Scanner in = new Scanner(System.in);
       System.out.println("I'm thinking of a number between 1 and 100 (including both)");
       System.out.println("Can you guess what it is?");
       System.out.print("Type a number: ");
       
       Scanner scanner = new Scanner(System.in);
       int Guess = scanner.nextInt();
       
       System.out.println("Your guess is: " + Guess);
       System.out.println("The number I was thinking of was: " + number);
       
       int difference = Guess - number;
       System.out.println("You were off by: " + difference);
       
    }
}
