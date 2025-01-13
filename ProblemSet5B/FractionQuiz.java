import java.util.Scanner;
public class FractionQuiz
{
    private static int score = 0;
    private static int total = 1;
    public static void main(String[] args){
        boolean cont = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Let the Fraction Quiz begin. Answers should be in lowest terms. Good luck!");
        while(cont){
            Fraction oneF = Fraction.randomFraction();
            Fraction twoF = Fraction.randomFraction();
            char sign = Fraction.randomSign();
            if(oneF.toDouble() < twoF.toDouble()){
                Fraction temp = oneF;
                oneF = twoF;
                twoF = temp;
            }
            System.out.println(oneF.toString() + sign + twoF.toString());
            String answer = input.nextLine();
            if(answer.equals(Fraction.solve(oneF, twoF, sign).toString())){
                score++;
                total++;
                System.out.println("Correct!");
            }else if(answer.equals("quit")){
                cont = false;
                total--;
            }else{
                System.out.println("Wrong, the answer was " + Fraction.solve(oneF, twoF, sign).toString());
                total++;
            }
        }
        Fraction ratio = new Fraction(score, total);
        int percent = (int) (ratio.toDouble() * 100);
        ratio = new Fraction(score, total);
        System.out.println("Your win/loss ratio was " + ratio.toString() + ", for a score of " + percent + " percent!");
    }
}
