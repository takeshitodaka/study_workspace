//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        NumberActions.generateNumber();
    }
}
class Number {
    private int n;

    void setN(int n){
        this.n=n;
    }
    void setN(double d){
        this.n=(int)d;
    }
    public int getN() {
        return n;
    }
    
}

class NumberActions{
    static void generateNumber(){
        Number number = new Number();
        number.setN(1);
        System.out.println(number.getN());
        number.setN(7.0);
        System.out.println(number.getN());
    }
}