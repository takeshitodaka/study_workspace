//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        MaxMethod mathMethod = new MaxMethod();
        System.out.println("7と2");
        System.out.println(mathMethod.maximum(7, 2));
        System.out.println("7と2と10");
        System.out.println(mathMethod.maximum(7, 2,10));
        System.out.println("3と4と9と11");
        System.out.println(mathMethod.maximum(3, 4,9,11));
    }
}

class  MaxMethod{
    int maximum(int a, int b){
        return Math.max(a,b);
    }
    int maximum(int a, int b, int c){
        int max;
        max = Math.max(a,b);
        max = Math.max(max,c);
        
        return max;
    }
    int maximum(int a, int b, int c, int d){
        int max;
        max = Math.max(a,b);
        max = Math.max(max,c);
        max = Math.max(max,d);
        
        return max;
    }
}