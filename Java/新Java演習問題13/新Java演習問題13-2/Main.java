//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main{
    public static void main(String args[] ) throws Exception {
         //デフォルトコンストラクタによりオブジェクトを一つ生成
        Sign sign1 = new Sign();
         //作成したオブジェクトにおいて引数を1としてsetSignを呼び出し
        sign1.setSign(1);
        //ゲッターを利用してsignの値を表示
        System.out.println(sign1.getSign());
        //作成したオブジェクトにおいて引数を-としてsetSignを呼び出し
        sign1.setSign('-');
        //ゲッターを利用してsignの値を表示
        System.out.println(sign1.getSign());
    }
}
class Sign {
    private int sign; //0はゼロ，1はプラス，2はマイナスを表す

    //引数が0か1か2であればフィールドにセットする
    void setSign(int sign){
        if(sign>=0 && sign<=2){
            this.sign=sign;
        }
    }
    void setSign(char sign){
        if(sign=='*'){
            this.sign=0;
        }else if(sign=='+'){
            this.sign=1;
        }else if(sign=='-'){
            this.sign=2;
        }
    }

    //引数が*なら0，＋なら1，-なら2をフィールドにセットするsetSignメソッドをオーバーロードする

    int getSign(){
        return sign;
    }
}