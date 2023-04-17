//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        ProductActions.generateProducts();
    }
}
class Product {
    private String code;
    private String color;
    private int price;

    Product(){
        this("","",0);
    }
    Product(String code){
        this(code,"",0);
    }
    Product(String code, String color){
        this(code,color,0);
    }
    Product(String code, String color, int price){
        this.code = code;
        this.color=color;
        this.price=price;
    }
    public String getCode() {
        return code;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }
    
}

class ProductActions{
   static void  generateProducts(){
    Product product1 = new Product();
    Product product2 = new Product("a001");
    Product product3 = new Product("a002","red");
    Product product4 = new Product("a003","blue",100);

    printProductInfo(product1);
    System.out.println();
    printProductInfo(product2);
    System.out.println();
    printProductInfo(product3);
    System.out.println();
    printProductInfo(product4);

   }
   static void printProductInfo(Product product){
    System.out.println("code:"+product.getCode());
    System.out.println("color:"+product.getColor());
    System.out.println("price:"+product.getPrice());
   }
}