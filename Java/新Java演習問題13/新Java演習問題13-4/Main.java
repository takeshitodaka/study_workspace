//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Multi multi = new Multi();
        System.out.println("1*3");
        System.out.println(multi.multiply(1,3));
        System.out.println("4*4*2");
        System.out.println(multi.multiply(4,4,2));
        System.out.println("2*3*4*5");
        System.out.println(multi.multiply(2,3,4,5));
    }
}
class Multi {
    private int a;
    private int b;
    private int c;
    private int d;

    int multiply(int a, int b){
        this.a=a;
        this.b=b;
        return a*b;
    }
    int multiply(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        return a*b*c;
    }
    int multiply(int a, int b, int c, int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        return a*b*c*d;
    }
}