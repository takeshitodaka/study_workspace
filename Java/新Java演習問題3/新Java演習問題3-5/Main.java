//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Member m1 = new Member("A0101", "田中宏", 25);
        Member m2 = new Member("A0111", "鈴木次郎", 28);
        MemberAction.printMember("m1", m1);
        MemberAction.printMember("m2", m2);
    }
}

class Member {
    String number;  //番号
    String name;  //名前
    int age;  //年齢
    public Member(String number, String name, int age){
        this.number=number;
        this.name=name;
        this.age=age;
    }
}

class MemberAction{
    static void printMember(String memberName,Member member){
        System.out.println(memberName+"="+member.number+", "+member.name+", "+member.age);
    }
}