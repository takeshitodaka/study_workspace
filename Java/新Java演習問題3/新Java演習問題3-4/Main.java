//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Point p1 = new Point(1.5,-0.7);
        Point p2 = new Point(1.2,2.0);
        PointActions.printPoint("p1", p1);
        PointActions.printPoint("p2", p2);
    }
}

class Point {
    double x;
    double y;

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
}

class PointActions{
    static void printPoint(String pointName, Point point){
        System.out.println(pointName+"={"+point.x+","+point.y+"}");
    }
}