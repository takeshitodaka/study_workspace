// 問題

// Double型のx座標とy座標を表すフィールド変数を持つPointクラスを作成しなさい．
// 　また，このクラスに基づくオブジェクトを1つ作成し，xとyに，それぞれ1.5と0.7をメンバー参照演算子を用いて代入しなさい．最後に，メンバー参照演算子を利用して，xとyの値を表示するMainという名前の実行クラスを作成しなさい．

// 注意１：このシステムでは，一つのファイルに複数のクラスを記述する方法でプログラミングを実施します．そのため，publicのアクセス修飾子は実行クラスのみに付けるようにし，必要なクラスを全て一つの画面に記述します．

// 注意２：実行クラスMainの一部は予め表示されています．今回は，予めmainの中で記述されている以下の部分を削除し，プログラムを開始してください．

//     Scanner sc = new Scanner(System.in);
//     String s = sc.next();
//     System.out.println(s);

// 注意３：定義クラスは，実行クラスであるMainの下に記述するようにしなさい．
// 入力

// なし

// 出力

// x=1.5
// y=0.7
// ※文字はすべて半角

// サンプルケース1
// 入力値

// なし

// 期待される出力値

// x=1.5
// y=0.7


//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Point pt = new Point();
        System.out.println("x="+pt.x);
        System.out.println("y="+pt.y);
    }
}
class Point {
    static double x = 1.5;
    static double y = 0.7;
}