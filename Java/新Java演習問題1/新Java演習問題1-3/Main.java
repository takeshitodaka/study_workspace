//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        CreatePrintPlayer.setPrintPlayer();
    }
}
class Player {
    String handle; //呼び名
    int[] hand; //手札配列
    int tips; //現在のチップ数
    public Player(){

    }
}

class CreatePrintPlayer{

    static void setPrintPlayer(){
        Player player = new Player();
        player.handle="Tom";
        player.hand=new int[] {2,13,26,13,48};
        player.tips=50;

        String outputHand="";
        for(int hand: player.hand){
            outputHand = outputHand + hand + " ";
        }
        System.out.println("呼び名="+player.handle);
        System.out.println("手札配列={"+outputHand+"}");
        System.out.println("現在のチップ数="+player.tips);

    }


}