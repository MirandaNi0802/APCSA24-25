/*Miranda Ni
 * September 23, 2024
 * ProblemSet2A
 */
public class Circle
{
    //declaring instance variable
    private double radius;
    
    //default constructor
    public Circle(){
        //initialize
        radius = 1;
    }
    
    //parameterized constructor
    public Circle(double r){
        //initialize
        radius = r;
    }
    
    public String toString(){
        return "Hello, I am a circle with a radius of " + radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double circumference(){
        return (radius * 2) * Math.PI;
    }
    
    public double area(){
        return (radius * radius * Math.PI);
    }
}
