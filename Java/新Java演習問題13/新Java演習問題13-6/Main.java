//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        //半径のみを引数とするコンストラクタを利用し，半径4のオブジェクトを作成し，Circle型変数cに代入する．
        Circle c = new Circle(4);
        //3つの引数を取るコンストラクタを利用し，半径2，x座標1，y座標1のオブジェクトを作成し，Circle型変数dに代入する．
        Circle d = new Circle(1,1,2);
        // cのオブジェクトのx，y座標と半径の表示
        System.out.println((int)c.getX()+","+(int)c.getY()+","+(int)c.getRadius());
        // dのオブジェクトのx，y座標と半径の表示
        System.out.println((int)d.getX()+","+(int)d.getY()+","+(int)d.getRadius());
        // cのオブジェクトのx座標を2に設定
        c.move_x(2);
        // cのオブジェクトの半径を0.5倍に設定
        c.scale(0.5);
        // cオブジェクトのx，y座標と半径の表示
        System.out.println((int)c.getX()+","+(int)c.getY()+","+(int)c.getRadius());
        
        // cのオブジェクトのx座標を-2，y座標を-2に設定
        c.move_x(-2,-2);
        
        // cのオブジェクトの半径を2倍に設定
        c.scale(2);
        // cオブジェクトのx，y座標と半径の表示
        System.out.println((int)c.getX()+","+(int)c.getY()+","+(int)c.getRadius());
        // dのオブジェクトのy座標を2に設定
        d.move_y(2);
        // dのオブジェクトの半径を0.5倍に設定
        d.scale(0.5);
        // dのオブジェクトのx，y座標と半径の表示
        System.out.println((int)d.getX()+","+(int)d.getY()+","+(int)d.getRadius());
        // ⑭move_yを利用し，dのオブジェクトのx座標とy座標を共に-4に設定
        d.move_y(-4,-4);
        // ⑮dのオブジェクトの半径を4倍に設定
        d.scale(4);
        // ⑯dのオブジェクトのx，y座標と半径の表示
        System.out.println((int)d.getX()+","+(int)d.getY()+","+(int)d.getRadius());

    }
}

class Circle{
    private double x;
    private double y;
    private double radius;
    //引数radiusのみを取るコンストラクタ
    public Circle(double radius) {
        this.radius = radius;
    }
    //3つの引数x，y，radiusを取るコンストラクタをオーバーロード
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //引数xを取り，x座標を設定するためのmove_xメソッド，戻り値はなし
    void move_x(double x){
        this.x=x;
    }

    //引数xとyを取り，x座標とy座標を設定するためのmove_xメソッドをオーバーロード
    void move_x(double x, double y){
        this.x=x;
        this.y=y;
    }

    //引数yを取り，y座標を設定するためのmove_yメソッド
    void move_y(double y){
        this.y=y;
    }
    
    //引数xとyを取り，x座標とy座標を設定するためのmove_yメソッドをオーバーロード
    void move_y(double x,double y){
        this.x=x;
        this.y=y;
    }

    //半径radiusを引数倍するscaleメソッド
    void scale(double multi){
        radius = radius*multi;
    }

    //座標xのためのゲッター
    double getX(){
        return x;
    }

    //座標yのためのゲッター
    double getY(){
        return y;
    }
    
    //座標radiusのためのゲッター
    double getRadius(){
        return radius;
    }
}