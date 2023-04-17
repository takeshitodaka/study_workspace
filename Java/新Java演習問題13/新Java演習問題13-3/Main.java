//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        //デフォルトコンストラクタを利用してオブジェクトをTaiyakiアブジェクトを作成
        Taiyaki taiyaki = new Taiyaki();

        //タイ焼きオブジェクトにおいて中身を”あんこ”でセット
        taiyaki.setNakami("あんこ");
        //タイ焼きの内容を表示
        taiyaki.printTaiyakiInfo();
        //タイ焼きオブジェクトにおいて中身はチョコ，グラムを110としてセット
        taiyaki.setNakami("チョコ");
        taiyaki.setGram(110);
        //タイ焼きの内容を表示
        taiyaki.printTaiyakiInfo();
        
    }
}

class Taiyaki {
    private String nakami;
    private String size;
    private int gram;

    //タイ焼きの中身，サイズ，グラムを表示するメソッド
    public void printTaiyakiInfo(){
        System.out.println("タイ焼きの中身:"+nakami);
        System.out.println("グラム:"+gram);
        System.out.println("サイズ:"+size);
    }

    //たいやきのサイズを戻すゲッター
    public String getSize(){
        return size;
    }

    //タイ焼きの中身，グラムを引数で設定するセッター，但し，サイズは，70グラム未満を小，70グラム以上90グラム以下を中，それ以上を大として設定する
    public void setGram(int gram){
        this.gram=gram;
        if(gram<70){
            size="小";
        }else if (gram >=70 && gram <= 90){
            size = "中";
        }else if (gram > 90){
            size="大";
        }
    }

    //タイ焼きの中身のみを引数により設定，グラムはリテラル90グラムで設定．但し，ここでは90グラムに基づきサイズも設定される
    public void setNakami(String nakami){
        this.nakami=nakami;
        setGram(90);
    }

}