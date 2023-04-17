// クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        
        Glass g1 = new Glass("abc",500.0,300);
        Glass g2 = new Glass("def",800.0);
        Glass g3 = new Glass("ghi");

        GlassActions.printGlasses(g1);
        GlassActions.printGlasses(g2);
        GlassActions.printGlasses(g3);
    }
}
class Glass {
    String code;
    double capacity;
    int price;

    Glass(String s, double r, int p){
        code=s;
        capacity=r;
        price=p;
    }
    Glass(String s, double r){
        code=s;
        capacity=r;
        price=100;
    }
    Glass(String s){
        code=s;
        capacity=10.0;
        price=200;
    }
}

class GlassActions{
    static void printGlasses(Glass glass){
        System.out.println(
            "code="+glass.code+"\n"
            +"capacity="+glass.capacity+"\n"
            +"price="+glass.price+"\n"
        );
    }
}