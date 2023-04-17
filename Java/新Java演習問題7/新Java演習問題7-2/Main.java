//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Calculator c = new Calculator();
        c.add(150);
        c.show();
        c.subtract(100);
        c.show();
        c.subtract(80);
        c.show();

    }
}
class Calculator{
    double total;
    
    void add(double x){
        total += x;
    }
    void subtract(double x){
        total -= x;
        if(total < 0){
            total=0;
        }
    }

    void clear(){
        total = 0;
    }
    void show(){
        System.out.println(total);
    }
    }