//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Product product1 = new Product("A101",3500);
        Product product2 = new Product("A102",2000);
        Product product3 = new Product("B100",5500);
        ProductActions.printProductInfo(product1);
        ProductActions.printProductInfo(product2);
        ProductActions.printProductInfo(product3);

        System.out.println();
        
        product1.setCode("s1000");
        product1.setPrice(10000);
        product2.setCode("s1001");
        product2.setPrice(8000);
        product3.setCode("s1002");
        product3.setPrice(3000);
        ProductActions.printProductInfo(product1);
        ProductActions.printProductInfo(product2);
        ProductActions.printProductInfo(product3);
    }
}
class Product {
    String code;
    int price;

    Product(String c, int p){
        code=c;
        price=p;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class ProductActions{
    static void printProductInfo(Product product){
        System.out.println(
            "コード:"+product.getCode()
            +" 価格:"+product.getPrice()+"円");
    }
}