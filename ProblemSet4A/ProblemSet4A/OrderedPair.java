public class OrderedPair
{
    private double x, y;
    
    //constructor with no parameter
    public OrderedPair(){
        x = 0;
        y = 0;
    }
    
    //constructor with parameters
    public OrderedPair(double a, double b){
        x = a;
        y = b;
    }
    
    //return an ordered pair
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    
    //return the x value in an ordered pair
    public double getX(){
        return x;
    }
    
    //return the y value in an ordered pair
    public double getY(){
        return y;
    }
}
