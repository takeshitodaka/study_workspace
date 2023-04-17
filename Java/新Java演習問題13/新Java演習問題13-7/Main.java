//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Test test = new Test();
        test.method('a');
        test.method("I am HIU student");
        test.method("This is Java Programming", 999);
    }
    
}

class Test{
    void method(){
        System.out.println("引数のない method() です");
        
    }
    void method(char code){
        System.out.println("code="+code);
    }
    void method(String str){
        System.out.println("str="+str);
    }
    void method(String str, int iValue){
        System.out.println("str="+str+",iValue="+iValue);
    }
}