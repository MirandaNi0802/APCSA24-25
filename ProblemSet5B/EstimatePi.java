public class EstimatePi
{
    public static void main(String[] args){
        Fraction MILU = new Fraction(355, 113);
        final double EPSILON = Math.abs(Math.PI - MILU.toDouble());
        while(Math.abs(Math.PI - MILU.toDouble()) >= EPSILON){
            if(Math.PI - MILU.toDouble() < 0){
                MILU.setDenom(MILU.getDenom()+1);
            }else{
                MILU.setNum(MILU.getNum()+1);
            }
        }
        System.out.println(MILU.toString());
    }
}
