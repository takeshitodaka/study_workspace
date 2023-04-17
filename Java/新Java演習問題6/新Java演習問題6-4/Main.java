//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Dogs dog1 = new Dogs("ジョン",2);
        Dogs dog2 = new Dogs("ポチ",0);
        System.out.println("名前:"+dog1.name+"\n年齢:"+dog1.age+"\n");
        System.out.println("名前:"+dog2.name+"\n年齢:"+dog2.age+"\n");
    }
}

class Dogs{
    String name;
    int age;
    public Dogs(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}