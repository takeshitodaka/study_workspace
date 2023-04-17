//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Point pt1 = new Point(1.5,-0.7);
        Point pt2 = new Point(1.2,2.0);
        pt1.printPointInfo();
        pt2.printPointInfo();
    }
}
class Point {
    double x;
    double y;
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    void printPointInfo(){
        System.out.println(
            "p={"+x+","+y+"}"
        );
    }
}