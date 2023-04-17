//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        //10を引数としてオブジェクトを作成，参照を参照変数aに代入
        Number a = new Number(10);
        //20を引数としてオブジェクトを作成，参照を参照変数bに代入
        Number b = new Number(20);
        //aにbを加算する
        a.add(b);
        //aの値を表示
        System.out.println(a.getN());
        //aからbを減算する
        a.subtract(b);
        //aの値の表示
        System.out.println(a.getN());
    }
}
class Number {
    private int n;
    //コンストラクタ
    
    public Number(int n) {
        this.n = n;
    }
    //ゲッターメソッド
    public int getN() {
        return n;
    }
    
    //加算：nにotherのnの値を加える
    void add(Number other){
        n+=other.getN();
    }
    //減算：nからotherのnの値を引く
    void subtract(Number other){
        n-=other.getN();
    }

}