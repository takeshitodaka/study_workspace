//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
          //10でオブジェクトaを作成
          Number a = new Number(10);
          //100でオブジェクトbを作成
          Number b = new Number(100);
          //aの値とbの値の加算したオブジェクトの参照を変数cとして受け取る
          Number c = a.add(b);
          //cのオブジェクトの値を表示する
          System.out.println(c.getN());
    }
}
class Number {
    //int型の変数nを定義，アクセス修飾子はprivate
    private int n;
    //コンストラクタ，引数はnでフィールド変数に代入
    public Number(int n){
        this.n=n;
    }
    //ゲッターnの値を返す
    public int getN(){
        return n;
    }
    //copyメソッド，新規にコピーオブジェクトを作成し，コピーオブジェクトの参照を返す
    public Number copy(){
        return new Number(this.n);
    }
    //addメソッド，Number型の引数mを取り，自身の数と加算を行った新しいオブジェクトの参照を返す
    public Number add(Number number){
        return new Number(this.n+number.getN());
    }
}