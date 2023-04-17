//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        CashbookActions.generateCashbook();
    }
}
class Cashbook{
    int balance;

    public Cashbook() {
    }

    public Cashbook(int balance) {
        this.balance = balance;
    }
    void deposit(int n){
        balance +=n;
    }
    void drownOut(int n){
        if(n>balance){
            balance = 0;
        }else{
            balance -= n;
        }
    }

    int getBalance() {
        return balance;
    }
    
}

class CashbookActions{
    static void generateCashbook(){
        Cashbook myBook = new Cashbook(1000);
        myBook.deposit(500);
        System.out.println("残額="+myBook.getBalance()+"円");
        myBook.drownOut(800);
        System.out.println("残額="+myBook.getBalance()+"円");
        myBook.drownOut(900);
        System.out.println("残額="+myBook.getBalance()+"円");
    }

}