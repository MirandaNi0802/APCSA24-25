import java.util.ArrayList;

public class Driver
{
    static public void main(String[] args){
        Math test = new Math();
        System.out.println(test.SofE(20));
        System.out.println(test.GC(120));
        
        
        ArrayList<Integer> a = new ArrayList();
        a.add(2);
        a.add(6);
        a.add(9);
        a.add(2);
        a.add(5);
        ArrayList<Integer> b = new ArrayList();
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(2);
        
        System.out.println(test.AB(a, b));
    }
}
