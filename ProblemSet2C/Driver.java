import java.util.Scanner; 
/**
 * Miranda Ni
 * September 26, 2024
 * Problem Set 2c
 */
public class Driver
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Formulas x = new Formulas();
        
        //Q1
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();
        System.out.println("The solutions for "+a+"x^2 + "+b+"x + "+c+" are "+x.findQuadraticRoots(a, b, c));
        System.out.println();
        
        //Q2
        System.out.println("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        OrderedPair slope1 = new OrderedPair(x1, y1);
        OrderedPair slope2 = new OrderedPair(x2, y2);
        System.out.println("A line between "+slope1+" and "+slope2+" has a slope of "+x.findSlope(slope1, slope2));
        System.out.println();
        
        //Q3
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double mx1 = input.nextDouble();
        System.out.print("y1: ");
        double my1 = input.nextDouble();
        System.out.print("x2: ");
        double mx2 = input.nextDouble();
        System.out.print("y2: ");
        double my2 = input.nextDouble();
        OrderedPair mid1 = new OrderedPair(mx1, my1);
        OrderedPair mid2 = new OrderedPair(mx2, my2);
        System.out.println("The midpoint between "+mid1+" and "+mid2+" is "+x.findMidpoint(mid1, mid2));
        System.out.println();
        
        //Q4
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int sk = input.nextInt();
        System.out.print("Starts with: ");
        double sa = input.nextDouble();
        System.out.print("Increases by: ");
        double sd = input.nextDouble();
        System.out.println("The sum of the first "+sk+" terms of an arithmetic series that starts with ");
        System.out.println(sa+" and increases by "+sd+" is "+x.findArithmeticSeriesSum(sa, sd, sk));
        System.out.println();
        
        //Q5
        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        int gk = input.nextInt();
        System.out.print("Starts with: ");
        double ga = input.nextDouble();
        System.out.print("Rate of growth: ");
        double gr = input.nextDouble();
        System.out.println("The sum of the first "+gk+" terms of a finite geometric series that starts with ");
        System.out.println(ga+" and increases by a rate of "+gr+" is "+x.findGeometricSeriesSum(ga, gr, gk));
        System.out.println();
        
        //Q6
        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int dice = input.nextInt();
        System.out.println("Rolling a 20-sided die... you got a "+ x.rollDie(dice) + "!");
        System.out.println();
    }
}
