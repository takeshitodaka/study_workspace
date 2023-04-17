//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Glass glass1 = new Glass(1000);
        Glass myGlass = glass1;
        Glass yourGlass = myGlass;
        Glass theirGlass = myGlass;

        yourGlass.capacity = 500;
        yourGlass.printGlassInfo();
        theirGlass.capacity = 1000;
        theirGlass.printGlassInfo();

    }
}

class Glass {
    double capacity; //容量

    public Glass(double capacity) {
        this.capacity = capacity;
    }
    void printGlassInfo(){
        System.out.println(
            "容量:"+capacity+"ml"
        );
    }
}