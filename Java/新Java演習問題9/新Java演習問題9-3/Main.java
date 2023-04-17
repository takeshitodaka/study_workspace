//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        CashbookActions.generateCashbook();
    }
}
class Cashbook{
    int balance;

    public Cashbook(int balance) {
        this.balance = balance;
    }

    public Cashbook() {
    }
    void deposit(int n){
        balance += n;
    }
    void drownOut(int n){
        if(n>balance){
            balance = 0;
        }else{
            balance -= n;
        }
    }

    public int getBalance() {
        return balance;
    }
}

class CashbookActions{

    static void generateCashbook(){
        Cashbook cashbook1 = new Cashbook(1000);
        cashbook1.deposit(500);
        cashbook1.drownOut(800);
        System.out.println("残高="+cashbook1.getBalance()+"円"); 
        cashbook1.drownOut(1000);
        System.out.println("残高="+cashbook1.getBalance()+"円"); 
        
        Cashbook zeroBook = new Cashbook();
        zeroBook.deposit(10);
        System.out.println("残高="+zeroBook.getBalance()+"円"); 
        zeroBook.drownOut(20);
        System.out.println("残高="+zeroBook.getBalance()+"円"); 


        
    }
}