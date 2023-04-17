//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Product product1 = new Product("A100",1000);
        Product product2 = new Product("A200",1500);
        Product product3 = new Product("B110",1200);
        Product product4 = new Product("B110",1800);
        Product product5 = new Product("B200",1400);
        Sales sales = new Sales();
        sales.add(product1);
        sales.add(product2);
        sales.add(product3);
        sales.add(product4);
        sales.add(product5);

        System.out.println(sales.getN()+"件/"+sales.getTotal()+"円");
    }
}
class Product {
    private String code; //商品番号
    private int price; //価格
    Product(String code, int price){ //コンストラクタ
        this.code=code;
        this.price=price;
    }
    //ゲッターメソッド
    String getCode(){
        return code;
    }
    int getPrice(){
        return price;
    }
}
class Sales{
    private int n;
    private int total;

    int getN(){
        return n;
    }
    int getTotal(){
        return total;
    }
    void add(Product p){
        n+=1;
        total+=p.getPrice();
    }
}