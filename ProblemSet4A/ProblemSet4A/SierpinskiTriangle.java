public class SierpinskiTriangle
{
    public static void main(String[] args){
        StdDraw.setScale(0, 1);
        StdDraw.setPenRadius(0.005);
        OrderedPair v1 = new OrderedPair(0, 1);
        OrderedPair v2 = new OrderedPair(1, 1);
        OrderedPair v3 = new OrderedPair(0.5, 0);
        StdDraw.point(0, 1);
        StdDraw.point(1, 1);
        StdDraw.point(0.5, 0);
        OrderedPair cur = new OrderedPair(0, 1);
        double x;
        double y;
        for(int i = 0; i < 10000; i++){
            int r = (int) (Math.random() * 3);
            if(r == 0){
                x = (cur.getX() + v1.getX())/2;
                y = (cur.getY() + v1.getY())/2;
            } else if(r == 1){
                x = (cur.getX() + v2.getX())/2;
                y = (cur.getY() + v2.getY())/2;
            } else {
                x = (cur.getX() + v3.getX())/2;
                y = (cur.getY() + v3.getY())/2;
            }
            cur = new OrderedPair(x, y);
            StdDraw.point(x, y);
        }
    }
}
