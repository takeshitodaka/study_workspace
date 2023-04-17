//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Point p1 = new Point(10.5,12.4);
        Point p2 = new Point(2.4,10.7);
        Point p3 = new Point(0.3,-0.5);
        Point p0 = p3.mul(new Point(2,2)).mul(p1.add(p2)).sub(p3);

        System.out.println(p0.toStr());
    }
}
class Point{
    private double x;
    private double y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    Point(double a) {
        this.x = a;
        this.y = a;
    }
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
    Point add(Point p){
        return new Point(x+p.getX(),y+p.getY());
    }
    Point sub(Point p){
        return new Point(x-p.getX(),y-p.getY());
    }
    Point mul(Point p){
        return new Point(x*p.getX(),y*p.getY());
    }
    Point div(Point p){
        return new Point(x/p.getX(),y/p.getY());
    }
    String toStr(){
        String val = "("+x+","+y+")";
        return val;
    }
}