public class Fraction{
    private int num;
    private int den;
    public Fraction()
    {
        num = 0;
        den = 1;
    }
    
    public Fraction(int n, int d)
    {
        num = n;
        den = d;
        if(den == 0){
            System.out.println("The denominator cannot be 0");
            den = 1;
        }
    }
    
    public Fraction(String frac)
    {
        num = Integer.parseInt(frac.substring(0, 1));
        den = Integer.parseInt(frac.substring(2));
        if(den == 0){
            System.out.println("The denominator cannot be 0");
            den = 1;
        }
    }
    
    public Fraction(Fraction frac)
    {
        num = frac.getNum();
        den = frac.getDenom();
    }
    
    public int getNum(){
        return num;
    }
    
    public int getDenom(){
        return den;
    }
    
    public String toString(){
        return num + "/" + den;
    }
    
    public double toDouble(){
        return (double) num / den;
    }
    
     private int GCF(int one, int two){
        if(one == 0 || two == 0) return 1;
         while(one != two){
            if(one > two){
                one -= two;
            }else{
               two -= one; 
            }
        }
        return one;
    }
    
    private void reduce(){
        int x = GCF(num, den);
        num /= x;
        den /= x;
    }
    
    public void setNum(int n){
        num = n;
    }
    
    public void setDenom(int d){
        den = d;
    }
    
    static Fraction multiply(Fraction one, Fraction two){
        int n = one.getNum() * two.getNum();
        int d = one.getDenom() * two.getDenom();
        return postCon(n, d);
    }
    
    static Fraction divide(Fraction one, Fraction two){
        int n = one.getNum() * two.getDenom();
        int d = one.getDenom() * two.getNum();
        if(two.getNum() == 0){
            System.out.println("The denominator cannot be 0");
            d = one.getDenom();
        }
        return postCon(n, d);
    }
    
    static Fraction add(Fraction one, Fraction two){
        int n = (one.getNum() * two.getDenom()) + (one.getDenom() * two.getNum());
        int d = one.getDenom() * two.getDenom();
        return postCon(n, d);
    }
    
    static Fraction subtract(Fraction one, Fraction two){
        int n = (one.getNum() * two.getDenom()) - (one.getDenom() * two.getNum());
        int d = one.getDenom() * two.getDenom();
        return postCon(n, d);
    }
    
    static private Fraction postCon(int n1, int d1){
        Fraction r = new Fraction(n1, d1);
        r.reduce();
        return r;
    }
    
    static Fraction randomFraction(){
        int one = (int) (Math.random() * 9 + 1);
        int two = (int) (Math.random() * 9 + 1);
        return new Fraction(one, two);
    }
    
    static char randomSign(){
        int sign = (int) (Math.random() * 4);
        if(sign == 0) return '+';
        else if(sign == 1) return '-';
        else if(sign == 2) return '*';
        else return '/';
    }
    
    static Fraction solve(Fraction a, Fraction b, char sign){
        Fraction ans = new Fraction();
        if(sign == '+'){
            ans = Fraction.add(a, b);
        }else if(sign == '-'){
            ans = Fraction.subtract(a, b);
        }else if(sign == '*'){
            ans = Fraction.multiply(a, b);
        }else if(sign == '/'){
            ans = Fraction.divide(a, b);
        }
        return ans;
    }
}