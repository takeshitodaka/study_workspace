//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Test2Actions.generateTest2();
    }
}
class Test2{
    private String name;
    private int age;
    private double tall;
    public Test2(String name) {
        this.name = name;
    }
    public Test2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Test2(String name, int age, double tall) {
        this.name = name;
        this.age = age;
        this.tall = tall;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getTall() {
        return tall;
    }
    
}

class Test2Actions{
    static void generateTest2(){
        Test2 test1= new Test2("tanaka",21,170.7);
        Test2 test2= new Test2("yoshida");
        Test2 test3= new Test2("takeda",40);

        printTest2Info(test1);
        System.out.println();
        printTest2Info(test2);
        System.out.println();
        printTest2Info(test3);

    }
    static void printTest2Info(Test2 test2){
        System.out.println("name:"+test2.getName());
        System.out.println("age:"+test2.getAge());
        System.out.println("tall:"+test2.getTall());
    }
}