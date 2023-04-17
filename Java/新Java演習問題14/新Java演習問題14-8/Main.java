//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Shoes[] shoes = new Shoes[3];
        shoes[0] = new Shoes(25);
        shoes[1] = new Shoes(27);
        shoes[2] = new Shoes(22);

        for(Shoes shoe : shoes){
            System.out.println(shoe.size);
        }
    }
}
class Shoes{
    int size;
    Shoes(int size){
        this.size=size;
    }
}