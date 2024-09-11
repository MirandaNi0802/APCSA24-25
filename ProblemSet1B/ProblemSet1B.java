import java.util.Scanner;

public class ProblemSet1B
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Celsius to Fahrenheit
        System.out.println("*** Celsius --> Fahrenheit ***");
        System.out.print("Enter a temperature in Celsius: ");
        double CTemp = input.nextDouble();
        double FTemp = (CTemp * (9/5.0)) + 32;
        System.out.println(CTemp + "° Celsius = " + FTemp + "° Fahrenheit");
        System.out.println();
        
        //BMI
        System.out.println("*** BMI Calculator ***");
        System.out.print("Enter a weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter a height in m: ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("A " + height + "m tall adult who weights " + weight + "kg has a BMI of " + bmi + ".");
        System.out.println();
        
        //DaysAndWeeks
        System.out.println("*** Days --> Weeks and Days ***");
        System.out.print("Enter a number of days: ");
        int iDays = input.nextInt();
        int weeks = iDays / 7;
        int fDays = iDays % 7;
        System.out.println(iDays + " days is equal to " + weeks + " weeks, " + fDays + " days.");
        System.out.println();
        
        //ReceiptGenerator
        System.out.println("*** Receipt Generator ***");
        System.out.print("Number of units you're buying: ");
        int unit = input.nextInt();
        System.out.print("Price per unit: ");
        double price = input.nextDouble();
        System.out.print("Tax rate: ");
        double tax = input.nextDouble();
        double fPrice = unit * price * (tax/100 + 1);
        System.out.println("Purchasing " + unit + " units at $" + price + " with " + tax + "% tax will cost $" + fPrice);
        System.out.println();
        
        //SumOfDigits
        System.out.println("*** Sum of digits ***");
        System.out.print("Enter a positive, three-digit number: ");
        int num = input.nextInt();
        int one = num / 100;
        int two = (num - one * 100) / 10;
        int three = (num - (one * 100) - (two * 10));
        int sum = one + two + three;
        System.out.println("The sum of the digits of " + num + " is " + sum);
    }
}
