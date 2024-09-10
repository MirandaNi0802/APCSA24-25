
import java.util.Scanner;

public class InputOutput
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your favourite course? ");
        String course = input.nextLine();
        System.out.print("What is your favourite show? ");
        String show = input.nextLine();
        System.out.print("How many hours do you spend studying each day? ");
        int hCourse = input.nextInt();
        System.out.print("How many hours do you spend watching shows each day? ");
        int hShow = input.nextInt();
        int t = hCourse + hShow;
        
        //Summary
        System.out.println();
        System.out.println("Summary: ");
        System.out.println("Your favourite course is " + course + ".");
        System.out.println("Your favourite show is " + show + ".");
        System.out.println("You spend " + hCourse + " hours studying each day.");
        System.out.println("You spend " + hShow + " hours watching shows each day.");
        System.out.println("In total, you spend " + t + " hours studying and watching shows each day.");
    }
}
