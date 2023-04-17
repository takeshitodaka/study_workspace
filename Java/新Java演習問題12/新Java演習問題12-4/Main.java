//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        TestActions.generateTest();
    }
}

class Test{
    private int[] numbers;

    public Test() {
        this.numbers = new int[10];
        for(int i=0;i<10;i++){
            this.numbers[i]=i+1;
        }
    }
    public Test(int n) {
        this.numbers = new int[10];
        for(int i=0;i<10;i++){
            this.numbers[i]=n+i;
        }
        
    }
    public int[] getNumbers() {
        return numbers;
    }
    
}
class TestActions{
    static void generateTest(){
        Test test1 = new Test();
        printTestInfo(test1);
        System.out.println();
        
        Test test2 = new Test(6);
        printTestInfo(test2);
    }
    static void  printTestInfo(Test test){
        String printVal="";
        for(int val:test.getNumbers()){
            printVal += val+" ";
        }
        System.out.println(printVal);
        System.out.println("配列の最後は"+test.getNumbers()[test.getNumbers().length-1]+"です");
    }

}