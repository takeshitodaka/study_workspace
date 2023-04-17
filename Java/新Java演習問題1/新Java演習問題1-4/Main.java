//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Rect r1 = new Rect();
        r1.vertical=10.0;
        r1.horizontal=15.0;

        Rect r2 = new Rect();
        r2.vertical=30.1;
        r2.horizontal=12.4;

        System.out.println("r1:"+r1.vertical+"*" + r1.horizontal);
        System.out.println("r2:"+r2.vertical+"*" + r2.horizontal);
    }
}
class Rect{
    double vertical;
    double horizontal;

}