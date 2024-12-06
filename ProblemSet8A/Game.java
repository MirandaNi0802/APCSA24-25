import java.util.Scanner;
public class Game
{
    static String[][] ttt = new String[3][3];
    static boolean X = false;
    static boolean O = false;
    static int round = 0;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        initializeBoard(ttt);
        playGame();
        System.out.println("Play again? Y/N");
        String again = input.nextLine();
        if(again.equals("Y")){
            playAgain();
        }
    }
    
    static void playGame(){
        while(!gameOver(ttt)){
            round++;
            System.out.println("Round " + round + ":");
            printBoard(ttt);
            String index = "";
            if(round % 2 != 0){
                System.out.print("X, make your move (row, col): ");
                index = input.nextLine();
                System.out.println();
            }else{
                System.out.print("O, make your move (row, col): ");
                index = input.nextLine();
                System.out.println();
            }
            int row = Integer.parseInt(index.substring(1, 2));
            int col = Integer.parseInt(index.substring(3, 4));
            while(!ttt[row][col].equals(" ")){
                System.out.println("Choose another spot: ");
                index = input.nextLine();
                row = Integer.parseInt(index.substring(1, 2));
                col = Integer.parseInt(index.substring(3, 4));
                System.out.println();
            }
            if(round % 2 != 0) ttt[row][col] = "X";
            else ttt[row][col] = "O";
        }
        if(X) System.out.println("X WON!");
        else if(O) System.out.println("O WON!");
        printBoard(ttt);
    }
    
    static void playAgain(){
        initializeBoard(ttt);
        round = 0;
        playGame();
    }
    
    static void initializeBoard(String[][] a){
        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[0].length; c++){
                a[r][c] = " ";
            }
        }
    }
    
    static void printBoard(String[][] a){
        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[0].length; c++){
                System.out.print("[" + a[r][c] + "]");
            }
            System.out.println();
        }
    }
    
    public static boolean gameOver(String[][] a){
        for(int r = 0; r < a.length; r++){
            if(a[r][0].equals(a[r][1]) && a[r][0].equals(a[r][2]) && !a[r][0].equals(" ")){
                if(a[r][0].equals("X")) X = true;
                else if(a[r][0].equals("O")) O = true;
                return true;
            }
        }
        for(int c = 0; c < a[0].length; c++){
            if(a[0][c].equals(a[1][c]) && a[0][c].equals(a[2][c]) && !a[0][c].equals(" ")){
                if(a[0][c].equals("X")) X = true;
                else if(a[0][c].equals("O")) O = true;
                return true;
            }
        }
        if(a[0][0].equals(a[1][1]) && a[0][0].equals(a[2][2]) && !a[0][0].equals(" ")){
            if(a[0][0].equals("X")) X = true;
            else if(a[0][0].equals("O")) O = true;
            return true;
        }
        if(a[0][2].equals(a[1][1]) && a[0][2].equals(a[2][0]) && !a[0][2].equals(" ")){
            if(a[0][2].equals("X")) X = true;
            else if(a[0][2].equals("O")) O = true;
            return true;
        }
        return false;
    }
}
