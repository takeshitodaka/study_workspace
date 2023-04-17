//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        CoinCaseActions.generateCoinCase();
    }
}
class CoinCase {
    int oneYenCoins;
    int fiveYenCoins;
    int tenYenCoins;
    int fiftyYenCoins;
    int handYenCoins;
    int fiveHandYenCoins;
    void addCoins(int kind, int value){
        switch (kind) {
            case 1:
                oneYenCoins += value;
                break;
            case 5:
                fiveYenCoins += value;
                break;
            case 10:
                tenYenCoins += value;
                break;
            case 50:
                fiftyYenCoins += value;
                break;
            case 100:
                handYenCoins += value;
                break;
            case 500:
                fiveHandYenCoins += value;
                break;
        
            default:
                break;
        }
    }
    int getCount(int kind){
        switch (kind) {
            case 1:
                return oneYenCoins;
            case 5:
                return fiveYenCoins;
            case 10:
                return tenYenCoins;
            case 50:
                return fiftyYenCoins;
            case 100:
                return handYenCoins;
            case 500:
                return fiveHandYenCoins;
            default:
                return 0;
        }
    }
    int getAmount(int kind){
        switch (kind) {
            case 1:
                return oneYenCoins;
            case 5:
                return fiveYenCoins*5;
            case 10:
                return tenYenCoins*10;
            case 50:
                return fiftyYenCoins*50;
            case 100:
                return handYenCoins*100;
            case 500:
                return fiveHandYenCoins*500;
            default:
                return 0;
        }
    }
    int getTotal(){
        int total = oneYenCoins + fiveYenCoins*5 +
            tenYenCoins*10 + fiftyYenCoins*50 +
            handYenCoins*100 + fiveHandYenCoins*500;

        return total;
    }
    int getTotalCount(){
        return oneYenCoins+fiveYenCoins+tenYenCoins+
                fiftyYenCoins+handYenCoins+fiveHandYenCoins;
    }
}

class CoinCaseActions{
    static void generateCoinCase(){
        CoinCase case1 = new CoinCase();
        case1.addCoins(500, 1);
        case1.addCoins(100, 2);
        case1.addCoins(50, 30);
        case1.addCoins(10, 5);
        case1.addCoins(5, 1);
        case1.addCoins(1, 2);

        System.out.println("500円"+case1.getCount(500)+"枚="+case1.getAmount(500)+"円");
        System.out.println("100円"+case1.getCount(100)+"枚="+case1.getAmount(100)+"円");
        System.out.println("50円"+case1.getCount(50)+"枚="+case1.getAmount(50)+"円");
        System.out.println("10円"+case1.getCount(10)+"枚="+case1.getAmount(10)+"円");
        System.out.println("5円"+case1.getCount(5)+"枚="+case1.getAmount(5)+"円");
        System.out.println("1円"+case1.getCount(1)+"枚="+case1.getAmount(1)+"円");
        System.out.println("総枚数"+case1.getTotalCount()+"枚");
        System.out.println("総額"+case1.getTotal()+"円");
    }
}