//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Member mem1 = new Member("A0101","情報太郎",30);
        Member mem2 = new Member("A0111","一十一",13);
        mem1.printMemberInfo();
        mem2.printMemberInfo();
    }
}
class Member {
    String number;
    String name;
    int age;
    public Member(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }
    void printMemberInfo(){
        System.out.println("m="+number+", "+name+", "+age);

    }
}