//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Fruit[] fruits = new Fruit[]{
            new Fruit(Integer.parseInt(sc.next())),
            new Fruit(Integer.parseInt(sc.next())),
            new Fruit(Integer.parseInt(sc.next())),
        };
        for(Fruit fruit : fruits){
            System.out.println(fruit.toStr());
        }
    }
}
class Fruit{
    int price;
    Fruit(int price){
        this.price=price;
    }
    String toStr(){
        return "Fruit class:"+price;
    }
 }