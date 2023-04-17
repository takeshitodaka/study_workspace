//クラス名は必ずMainにする必要があります。
import java.util.*;

import javax.security.auth.Subject;

public class Main {
    public static void main(String args[] ) throws Exception {
        Profile profile1 = new Profile(
            "木村拓哉",
            new String[] {"寿司", "焼肉", "納豆", "パスタ", "アイス"},
            new String[] {"トマト", "ナス", "ホワイトアスパラ", "ブロッコリー", "ピータン"},
            new String[] {"Javaプログラミング", "Web技術基礎 ICT入門", "ソフトコンピューティング入門", "ゼミナール"},
            new String[] {"情報倫理", "法学", "離散数学", "プログラム入門", "ネットワーク"}
        );
        Profile profile2 = new Profile(
            "中居正広",
            new String[] {"肉まん", "餃子", "焼き鳥", "焼売", "お好み焼き"},
            new String[] {"たこ焼き", "フライドチキン", "すき焼き", "鍋", "きゅうり"},
            new String[] {"体育", "健康とスポーツ1", "健康とスポーツ2", "スポーツと健康1", "スポーツと健康2"},
            new String[] {"プログラミング1", "プログラミング2", "プログラミング3", "プログラミング4", "プログラミング5"}
        );
        OutputProfiles.printProfile(profile1);
        OutputProfiles.printProfile(profile2);
    }
}

class Profile{
    String name;
    String[] likes;
    String[] disLikes;
    String[] specialSubjects;
    String[] weakSubjects;

    public Profile(String name, String[] likes, String[] disLikes, String[] specialSubjects, String[] weakSubjects){
        this.name=name;
        this.likes=likes;
        this.disLikes=disLikes;
        this.specialSubjects=specialSubjects;
        this.weakSubjects=weakSubjects;
    }
}

class OutputProfiles{
    static void printProfile(Profile profile){
        String outLikes="好きなものランキング:";
        String outDisLikes="嫌いなものランキング:";
        String outSpecialSubjects="得意科目ランキング:";
        String outWeakSubjects="不得意科目ランキング:";

        for(String value:profile.likes){
            outLikes=outLikes+value+" ";
        }
        for(String value:profile.disLikes){
            outDisLikes=outDisLikes+value+" ";
        }
        for(String value:profile.specialSubjects){
            outSpecialSubjects=outSpecialSubjects+value+" ";
        }
        for(String value:profile.weakSubjects){
            outWeakSubjects=outWeakSubjects+value+" ";
        }

        System.out.println(
            "氏名:"+profile.name+"\n"
            + outLikes+"\n"
            + outDisLikes+"\n"
            + outSpecialSubjects+"\n"
            + outWeakSubjects+"\n"
        );
    }
}