//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        CalculatorActions.doCalc();
    }
}
class Calculator{
    double result;
    double calc(double num1, double num2, char operator){
        switch (operator) {
            case 'p':
                result=num1+num2;
                return result;
            case 'm':
                result=num1-num2;
                return result;
            case 'l':
                result=num1*num2;
                return result;
            case 'd':
                result=num1/num2;
                return result;
            default:
                return result;   
        }
    }
}

class CalculatorActions{
    static void doCalc(){
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble(); //double型
        double num2 = sc.nextDouble(); //double型
        char operator = sc.next().charAt(0); //char型

        Calculator calculator1 = new Calculator();
        
        System.out.println((double)(Math.round(calculator1.calc(num1, num2, operator)*100))/100);
        

    }
}