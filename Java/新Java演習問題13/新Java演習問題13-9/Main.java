//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Prime prime = new Prime();
        System.out.println(prime.judge(13));
        System.out.println(prime.judge(17,28));
    }
}
class Prime{
    private boolean result;
    boolean judge(int num){
        result=true;
        if(num<=1){
           result=false; 
        }
        for(int i = 2; i<num; i++){
            if(num%i==0){
                result=false;
            }
        }

        return result;
    }
    boolean judge(int num1, int num2){
        result=true;
        if(num1<=1||num2<=1){
           result=false; 
        }
        for(int i = 2; i<num1; i++){
            if(num1%i==0){
                result=false;
            }
        }
        
        for(int i = 2; i<num2; i++){
            if(num1%i==0){
                result=false;
            }
        }

        return result;
    }
    
}