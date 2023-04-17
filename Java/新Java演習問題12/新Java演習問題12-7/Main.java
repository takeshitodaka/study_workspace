//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        AActions.generateA();
    }
}
class A {
    private int age;
    private String name;

    A(){
        this(5,"dog");
    }
    A(int age, String name){
        this.age=age;
        this.name=name;
    }

    A(int age){
        this(age,"cat");
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    
}
class AActions{
    static void generateA(){
        A animal1 = new A();
        A animal2 = new A(3);
        A animal3 = new A(10,"rat");
        printAInfo(animal1);
        printAInfo(animal2);
        printAInfo(animal3);


    }
    static void printAInfo(A a){
        System.out.println(a.getAge());
        System.out.println(a.getName());
    }
}