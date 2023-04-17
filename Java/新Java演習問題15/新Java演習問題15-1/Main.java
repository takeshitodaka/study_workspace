//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Nickname nickname1 = new Nickname();
        nickname1.setName("三郎");
        nickname1.setNickname("さんちゃん");
        nickname1.dispWho();
    }
}
class Name{
    String name;
    void setName(String name){
        this.name=name;
    }
    void dispName(){
        System.out.println(name);
    }
}
class Nickname extends Name{
    String nickname;
    void setNickname(String nickname){
        this.nickname=nickname;
    }
    void dispWho(){
        System.out.println(name+"は"+nickname);
    }
}
