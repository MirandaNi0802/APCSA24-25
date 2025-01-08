public class Driver
{
    public static void main(String[] args){
        Fraction one = new Fraction();
        Fraction two = new Fraction(1, 2);
        Fraction three = new Fraction("1/2");
        Fraction four = new Fraction(two);
        
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());
        
        System.out.println(Fraction.multiply(two, three));
        System.out.println(Fraction.divide(two, three));
        System.out.println(Fraction.add(two, three));
        System.out.println(Fraction.subtract(two, three));
    }
}
