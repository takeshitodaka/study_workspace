//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        SportingGoods goods1= new SportingGoods("サッカーボール","サッカー","プロ",5000);
        SportingGoods goods2= new SportingGoods("シューズ","テニス","アマ");
        SportingGoods goods3= new SportingGoods("ラケット","バトミントン");
        SportingGoods goods4= new SportingGoods("ボール");
        SportingGoods goods5= new SportingGoods();

        SportingGoodsActions.printSportingGoodsInfo(goods1);
        SportingGoodsActions.printSportingGoodsInfo(goods2);
        SportingGoodsActions.printSportingGoodsInfo(goods3);
        SportingGoodsActions.printSportingGoodsInfo(goods4);
        SportingGoodsActions.printSportingGoodsInfo(goods5);
    }
}

class SportingGoods{
    String name;
    String sportName;
    String grade;
    int price;
    public SportingGoods(String name, String sportName, String grade,int price){
        this.name=name;
        this.sportName=sportName;
        this.grade=grade;
        this.price=price;
    }
    public SportingGoods(String name, String sportName, String grade){
        this.name=name;
        this.sportName=sportName;
        this.grade=grade;
    }
    public SportingGoods(String name, String sportName){
        this.name=name;
        this.sportName=sportName;
    }
    public SportingGoods(String name){
        this.name=name;
    }
    public SportingGoods(){
    }
}

class SportingGoodsActions{
    static void printSportingGoodsInfo(SportingGoods sportingGoods){
        System.out.println(
            "用品名:"+sportingGoods.name +"\n"
            +"競技名:"+sportingGoods.sportName +"\n"
            +"仕様:"+sportingGoods.grade +"\n"
            +"価格:"+sportingGoods.price +"\n"
        );
    }
}