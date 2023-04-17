//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        OthelloActions.generateOthello();
    }
}
class Othello {
    private char[][] board;

    public Othello(char[][] board) {
        this.board = board;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }
    
}

class OthelloActions{
    static void generateOthello(){
        Othello othello = new Othello(new char[][] {
            new char[]{'o','o','o'},
            new char[]{'o','x','x'},
            new char[]{'o','x','o'}
        });
        
        printOthelloInfo(othello);
        System.out.println();
        
        othello = new Othello(new char[][] {
            new char[]{'x','o','x'},
            new char[]{'o','x','o'},
            new char[]{'x','x','o'}
        });
        
        printOthelloInfo(othello);

    }
    static void printOthelloInfo(Othello othello){
        for(char[] arrVal: othello.getBoard()){
            String printVal ="";
            for(char val:arrVal){
                printVal+=val+" ";
            }
            System.out.println(printVal);
        }
    }
}