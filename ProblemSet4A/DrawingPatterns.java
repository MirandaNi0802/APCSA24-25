public class DrawingPatterns
{
    public static void main(String[] args){
        drawGrid();
        drawCurve();
    }
    
    public static void drawGrid(){
        StdDraw.setScale(0, 500);
        for(int i = 0; i <= 500; i += 20){
            StdDraw.line(i, 0, i, 500);
            StdDraw.line(0, i, 500, i);
        }
    }
    
    public static void drawCurve(){
        StdDraw.setScale(0, 500);
        for(int i = 0; i <= 500; i += 20){
            StdDraw.line(i, 0, 500, i);
            StdDraw.line(i, 500, 0, i);
        }
    }
    
    public static void drawCircle(){
        StdDraw.setScale(0, 500);
        int a = 1;
        for(int i = 500; i >= 0; i -= 20){
            if(a % 2 == 0){
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledCircle(250, 250, i);
                a++;
            } else {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledCircle(250, 250, i);
                a++;
            }
        }
    }
}
