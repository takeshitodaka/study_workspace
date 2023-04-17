//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Dog[] dogs = new Dog[3];
        dogs[0]=new Dog("ポチ");
        dogs[1]=new Dog("ジョン");
        dogs[2]=new Dog("トム");

        for(Dog dog: dogs){
            System.out.println(dog.name);
        }

    }
}
class Dog{
    String name;
    Dog(String name){
        this.name=name;
    }
}