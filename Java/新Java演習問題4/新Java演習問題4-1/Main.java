//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Player dealer = new Player ("comp", new int[]{5,16,22,31,33}, 150);
        Player player1 = new Player ("Tom", new int[]{2,13,26,13,48}, 50);
        PlayerActions.printPlayer(dealer);
        PlayerActions.printPlayer(player1);
    }
}
class Player {
    String handle;  //呼び名
    int[] hand;  //手札配列
    int tips;  //チップの残り数
    public Player(String handle, int[] hand, int tips){
        this.handle=handle;
        this.hand=hand;
        this.tips=tips;
    }
}

class PlayerActions{
    static void printPlayer(Player player){
        String handPrintValue="";
        for(int value:player.hand){
            handPrintValue=handPrintValue+value+" ";
        }
        System.out.println(player.handle+", {"+handPrintValue+"}, "+player.tips);

    }
}