/*Miranda Ni
 * September 23, 2024
 * ProblemSet2A
 */
public class Cylinder
{
    //declaring instance variable
    private double height;
    private Circle base;
    
    //default constructor
    public Cylinder(){
        //initialize
        height = 1;
        base = new Circle();
    }
    
    //parameterized constructor
    public Cylinder(double r, double h){
        //initialize
        height = h;
        base = new Circle(r);
    }
    
    public String toString(){
        return "Hello, I am a cylinder with a radius of " + base.getRadius() + " and height of " + height;
    }
    
    public double getRadius(){
        //cylinder has same radius as the base circle
        return base.getRadius();
    }
    
    public double getHeight(){
        return height;
    }
    
    public double surfaceArea(){
        return (base.area() * 2) + (base.circumference() * height);
    }
    
    public double volume(){
        return (base.area() * height);
    }
}
