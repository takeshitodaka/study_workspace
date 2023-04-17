//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Sushi sushi1 = new Sushi("マグロ","にぎり",800);
        Sushi sushi2 = new Sushi("ウニ","軍艦",2000);
        SushiActions.printSushi(sushi1);
        SushiActions.printSushi(sushi2);
    }
}

class Sushi{
    String name;
    String type;
    int price;
    public Sushi(String name, String type, int price){
        this.name = name;
        this.type = type;
        this.price = price;
    }
}

class SushiActions{
    static void printSushi(Sushi sushi){
        System.out.println("名称:"+sushi.name+", 種類:"+sushi.type+", 価格:"+sushi.price+"円");

    }
}