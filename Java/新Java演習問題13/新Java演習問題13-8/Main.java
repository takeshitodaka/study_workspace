//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Polymorph polymorph = new Polymorph();
        System.out.println(polymorph.add(1, 2));
        System.out.println(polymorph.add(1, 2,3));
        System.out.println(polymorph.add((float)1.5,(float)2.5));
    }
}
class Polymorph{
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    float add(float a,float b){
        return a+b;
    }

}