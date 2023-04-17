// 問題

// String型の番号を表すnumber，String型の名前を表すname，int型の年齢を表すageの３つのフィールド変数を持つMemberクラスを作成しなさい．
// 　また，このクラスに基づくオブジェクトを2つ作成し，Memberクラスの変数m1とm2にオブジェクトを作成し，セットします．m1の番号に”A0101”，氏名に”田中宏”，年齢に”25”をセットします．また，m2の番号に”A0111”，氏名に”鈴木太郎”，年齢に”28”をセットします．最後に，m1とm2のすべてのフィールドの内容を表示する実行クラスを作成しなさい．

// 注意１：このシステムでは，一つのファイルに複数のクラスを記述する方法でプログラミングを実施します．そのため，publicのアクセス修飾子は実行クラスのみに付けるようにし，必要なクラスを全て一つの画面に記述します．

// 注意２：実行クラスMainの一部は予め表示されています．今回は，予めmainの中で記述されている以下の部分を削除し，プログラムを開始してください．

//     Scanner sc = new Scanner(System.in);
//     String s = sc.next();
//     System.out.println(s);

// 注意３：定義クラスは，実行クラスであるMainの下に記述するようにしなさい．
// 入力

// なし

// 出力

// 番号=A0101, 氏名=田中宏, 年齢=25
// 番号=A0111, 氏名=鈴木太郎, 年齢=28

// 文字は全角文字，記号は半角英数
// コンマの後に半角スペースが入っている

// サンプルケース1
// 入力値

// なし

// 期待される出力値

// 番号=A0101, 氏名=田中宏, 年齢=25
// 番号=A0111, 氏名=鈴木太郎, 年齢=28


//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Member m1 = new Member("A0101","田中宏",25);
        Member m2 = new Member("A0111","鈴木太郎",28);
        Member array[] = {m1,m2};
        PrintMembers.printAll(array);

    }
}

class Member{
    String number;
    String name;
    int age;
    public Member(String number, String name, int age){
        this.number=number;
        this.name=name;
        this.age=age;
    }
}

class PrintMembers{
    static void printAll(Member membersArray[]){
        for(Member currentMem: membersArray){
            System.out.println("番号="+currentMem.number+", 氏名="+currentMem.name+", 年齢="+currentMem.age);
        }

    }
}