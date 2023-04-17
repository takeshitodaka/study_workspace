//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Cake cake1 = new Cake();
        cake1.name="ショートケーキ";
        cake1.type="ピース";
        cake1.price=120;
        Cake cake2 = new Cake();
        cake2.name="ザッハトルテ";
        cake2.type="ホール";
        cake2.price=3600;

        OutputCake.printCake(cake1);
        OutputCake.printCake(cake2);
        
    }
}
class Cake{
    String name;
    String type;
    int price;
}

class OutputCake{
    static void printCake(Cake cake){
        System.out.println("名称:"+cake.name+", タイプ:"+cake.type+", 価格:"+cake.price+"円");

    }
}