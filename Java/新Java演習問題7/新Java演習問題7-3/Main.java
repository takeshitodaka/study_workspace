//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Calculator c = new Calculator();
        c.add(100);
        c.show();
        c.multiple(10);
        c.show();
        c.division(20);
        c.show();
        c.subtract(60);
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
    void multiple(double x){
        total *=  x;
    }
    void division(double x){
        total /= x;
    }

    void clear(){
        total = 0;
    }
    void show(){
        System.out.println(total);
    }
    }