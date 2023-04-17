//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Hand hand1= new Hand(new String[]{"ハート10","スペード2"});
        Hand hand2= new Hand(new String[]{"ダイヤ12","ハート5","クラブ2"});
        hand1.printHandInfo();
        hand2.printHandInfo();

    }
}

class Hand {
    String[] card;

    public Hand(String[] card) {
        this.card = card;
    }
    void printHandInfo(){
        String printHandVal="";
        for(String val:card){
            printHandVal += val+" ";
        }
        System.out.println(printHandVal);
    }
}