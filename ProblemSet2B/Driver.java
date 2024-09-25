/**
 * Miranda Ni
 * September 25, 2024
 * Problem Set 2B
 */
import java.util.Scanner;
public class Driver
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringTools sTools = new StringTools();
        
        System.out.println("lastLetter test cases:");
        System.out.println("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println(sTools.lastLetter(answer1));
        System.out.println("---------------------");
        
        System.out.println("formatPhoneNumber test cases:");
        System.out.println("Enter a 10 digit number: ");
        String answer2 = input.nextLine();
        System.out.println(sTools.formatPhoneNumber(answer2));
        System.out.println("---------------------");
        
        System.out.println("middleThree test cases:");
        System.out.println("Enter a word with an odd length of more than 3: ");
        String answer3 = input.nextLine();
        System.out.println(sTools.middleThree(answer3));
        System.out.println("---------------------");
        
        System.out.println("swapLastTwo test cases:");
        System.out.println("Enter a word with length of at least 2: ");
        String answer4 = input.nextLine();
        System.out.println(sTools.swapLastTwo(answer4));
        System.out.println("---------------------");
        
        System.out.println("frontAgain test cases:");
        System.out.println("Enter a word: ");
        String answer5 = input.nextLine();
        System.out.println("Enter a number smaller or equal to the word's length: ");
        int answer6 = input.nextInt();
        System.out.println(sTools.frontAgain(answer5, answer6));
        System.out.println("---------------------");
    }
}
