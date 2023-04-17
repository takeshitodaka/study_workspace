//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Player player1 = new Player ("comp",new int[]{5,16,22,31,33},190);
        Player player2 = new Player ("tom",new int[]{2,13,28,33,39},50);
        player1.printPlayerInfo();
        player2.printPlayerInfo();
    }
}
class Player {
    String handle;
    int[] hand;
    int tips;
    public Player(String handle, int[] hand, int tips) {
        this.handle = handle;
        this.hand = hand;
        this.tips = tips;
    }
    void printPlayerInfo(){
        String handPrintVal="";
        for(int val:hand){
            handPrintVal=handPrintVal+val+" ";
        }

        System.out.println(
            handle+", {"+handPrintVal+"}, "+tips
        );
    }
}