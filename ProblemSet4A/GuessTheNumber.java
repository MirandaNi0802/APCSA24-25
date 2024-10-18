import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        int r = (int) (Math.random() * 101) + 1;
        int guess = -1;
        int numGuess = 0;
        
        while(r != guess){
            System.out.print("Your guess: ");
            guess = input.nextInt();
            if(guess < r){
                System.out.println("Nope, that guess is too low.");
                numGuess++;
            } else if(guess > r){
                System.out.println("Nope, that guess is too high.");
                numGuess++;
            } else{
                System.out.println("You guessed it! It took you " + numGuess + " tries.");
            }
        }
    }
}
