//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Computer computer1 = new Computer();
        computer1.name="Dynabook";
        computer1.brand="東芝";
        computer1.type="ノート";
        computer1.manufacturedAt=2020;
        computer1.price=100000;

        Computer computer2 = new Computer();
        computer2.name="iPad";
        computer2.brand="アップル";
        computer2.type="タブレット";
        computer2.manufacturedAt=2021;
        computer2.price=30000;

        Computer computer3 = new Computer();
        computer3.name="ThinkPad";
        computer3.brand="Lenovo";
        computer3.type="ノート";
        computer3.manufacturedAt=2018;
        computer3.price=50000;
        OutputComputer.printComputer(computer1);
        OutputComputer.printComputer(computer2);
        OutputComputer.printComputer(computer3);
        OutputChangedComputer.printChangedComputers(computer1,computer2,computer3);

    }
}


class Computer{
    String name;
    String brand;
    String type;
    int manufacturedAt;
    int price;
}

class OutputComputer{
    static void printComputer(Computer computer){
        System.out.println("機種名:"+computer.name+", メーカー:"+computer.brand+", タイプ:"+computer.type+", 製造年:"+computer.manufacturedAt+", 価格:"+computer.price);

    }
}
class OutputChangedComputer{
    static void printChangedComputers(Computer computer1,Computer computer2,Computer computer3){
        System.out.println("機種入れ替え");
        
        computer1.name="Vostro";
        computer1.brand="デル";
        computer1.type="デスクトップ";
        computer1.manufacturedAt=2019;
        computer1.price=150000;

        computer2.name="Omen";
        computer2.brand="ヒューレットパッカード";
        computer2.type="ゲーミング";
        computer2.manufacturedAt=2020;
        computer2.price=250000;

        computer3.name="iMac";
        computer3.brand="アップル";
        computer3.type="デスクトップ";
        computer3.manufacturedAt=2020;
        computer3.price=180000;

        for(Computer computer: new Computer[] {computer1,computer2,computer3}){
            System.out.println("機種名:"+computer.name+", メーカー:"+computer.brand+", タイプ:"+computer.type+", 製造年:"+computer.manufacturedAt+", 価格:"+computer.price);
        }

    }
}