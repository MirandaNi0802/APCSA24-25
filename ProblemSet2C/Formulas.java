/**
 * Miranda Ni
 * September 26, 2024
 * Problem Set 2c
 */
public class Formulas
{
    //Given the three coefficients ina quadratic, return the roots
    public OrderedPair findQuadraticRoots (double a, double b, double c){
        double x, y;
        x = ((b * -1) + Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        y = ((b * -1) - Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        return new OrderedPair(x, y);
    }
    
    //Given two points, find the slope
    public double findSlope (OrderedPair A, OrderedPair B){
        return (B.getY() - A.getY()) / (B.getX() - A.getX());
    }
    
    //Given two point, find the midpoint
    public OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double x, y;
        x = (A.getX() + B.getX()) / 2;
        y = (A.getY() + B.getY()) / 2;
        return new OrderedPair(x, y);
    }
    
    //Given the first term, difference between each term, and number of terms,
    //find the sum of the arithmetic series sum
    public double findArithmeticSeriesSum (double a, double d, int k){
        return ((double) k / 2) * (2 * a + d * (k - 1));
    }
    
    //Given the first term, rate of change, and number of terms,
    //find the sum of the geometric series sum
    public double findGeometricSeriesSum (double a, double r, int k){
        return a * (((1 - Math.pow(r, k)) / (1 - r)));
    }
    
    //Given the number of sides a die has, return a random number
    //between 1 and and the number of sides
    public int rollDie (int sides){
        return ((int) Math.random() * sides ) + 1;
    }
}
