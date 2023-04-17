//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Cat cat = new Cat();
        cat.setName("たま");
        cat.setAge(2);
        cat.eat("魚");
        cat.walk(10);
        System.out.println(
            cat.getName()+"は今年"+
            cat.getAge()+"歳になった"+
            cat.meow()
        );
    }
}

class Animal{
    //String型の名前を格納するフィールド変数
    private String name;
    //int型の年齢を格納するフィールド変数
    private int age;
    //名前を設定するためのセッター
    public void setName(String name) {
        this.name = name;
    }
    
    //年齢を設定するためのセッター
    public void setAge(int age) {
        this.age = age;
    }
    
    //名前を受け取るためのゲッター
    public String getName() {
        return name;
    }

    //年齢を受け取るためのゲッター
    public int getAge() {
        return age;
    }
    
    void eat(String food) { //食べたものを文字列型の引数として受け取る
        System.out.println(
            age+"歳の"+
            name+"は"+
            food+"を食べた"
        ); //年齢，名前，食べた物を出力を参考に表示
    }
    void walk(int meters){ //歩いた距離をint型の引数として受け取る
        System.out.println(
            age+"歳の"+
            name+"は"+
            meters+"メートル歩いた"
        ); //年齢，名前，歩いた距離を出力を参考に表示
    }
}

class Cat extends Animal{
    String meow(){
        return "ニャー";
    }
}