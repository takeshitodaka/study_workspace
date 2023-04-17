//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        TestActions.generateTest();
    }
}

class Test {
    private int val1;
    private double val2;
    private String val3;
    
    public Test() {
    }
    public Test(int val1) {
        this.val1 = val1;
        this.val3 = val3;
    }
    public Test(int val1, String val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }
    public int getVal1() {
        return val1;
    }
    public double getVal2() {
        return val2;
    }
    public String getVal3() {
        return val3;
    }
    
}

class TestActions{
    static void generateTest(){
        Test test1 = new Test();
        Test test2 = new Test(17);
        Test test3 = new Test(11,"test");

        System.out.println("オブジェクト１");
        printTestInfo(test1);
        System.out.println();
        System.out.println("オブジェクト２");
        printTestInfo(test2);
        System.out.println();
        System.out.println("オブジェクト３");
        printTestInfo(test3);
    }

    static void printTestInfo(Test test){
        System.out.println("val1:"+test.getVal1());
        System.out.println("val2:"+test.getVal2());
        System.out.println("val3:"+test.getVal3());
    }
}