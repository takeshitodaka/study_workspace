//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        c1.add(100);
        c2.add(200);
        c1.show();
        c2.show();
    }
}
class Calculator{
    double total;
    
    void add(double x){
        total += x;
    }
    void clear(){
        total = 0;
    }
    void show(){
        System.out.println(total);
    }
    }