//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        University univ1 = new University("北海道情報大学", "江別市", 400);
        University univ2 = new University("琉球大学", "那覇市", 2000);

        univ1.printUniversityInfo();
        univ2.printUniversityInfo();
    }
}
class University{
    String name;
    String direction;
    int capacity;
    public University(String name, String direction, int capacity) {
        this.name = name;
        this.direction = direction;
        this.capacity = capacity;
    }
    void printUniversityInfo(){
        System.out.println(
            "大学名:"+name+"\n"
            +"住所:"+direction+"\n"
            +"定員:"+capacity+"\n"
        );
    }
}