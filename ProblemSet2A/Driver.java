/*Miranda Ni
 * September 23, 2024
 * ProblemSet2A
 */
public class Driver
{
    public static void main (String[] args){
        //instantiating the objects
        Circle one = new Circle();
        Circle two = new Circle(5);
        Cylinder three = new Cylinder();
        Cylinder four = new Cylinder(5, 5);
        
        //default circle
        System.out.println("Creating a circle with the default constructor!");
        System.out.println(one.toString());
        System.out.println("getRadius() --> " + one.getRadius() + " units");
        System.out.println("circumference() --> " + one.circumference() + " units");
        System.out.println("area() --> " + one.area() + " units^2");
        System.out.println();
        
        //parameterized circle
        System.out.println("Creating a circle with the parameterized constructor!");
        System.out.println(two.toString());
        System.out.println("getRadius() --> " + two.getRadius() + " units");
        System.out.println("circumference() --> " + two.circumference() + " units");
        System.out.println("area() --> " + two.area() + " units^2");
        System.out.println();
        
        //default cylinder
        System.out.println("Creating a cylinder with the default constructor!");
        System.out.println(three.toString());
        System.out.println("getRadius() --> " + three.getRadius() + " units");
        System.out.println("getHeight() --> " + three.getHeight() + " units");
        System.out.println("surfaceArea() --> " + three.surfaceArea() + " units^2");
        System.out.println("volume() --> " + three.volume() + " units^3");
        System.out.println();
        
        //parameterized cylinder
        System.out.println("Creating a cylinder with the parameterized constructor!");
        System.out.println(four.toString());
        System.out.println("getRadius() --> " + four.getRadius() + " units");
        System.out.println("getHeight() --> " + four.getHeight() + " units");
        System.out.println("surfaceArea() --> " + four.surfaceArea() + " units^2");
        System.out.println("volume() --> " + four.volume() + " units^3");
        System.out.println();
    }
}
