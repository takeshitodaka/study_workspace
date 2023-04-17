//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        ProductActions.genearateProducts();
    }
}
class Product {
    private String code;
    private String name;
    private double tax_rate;
    private int tax_price;
    private int non_tax_price;

    

    public Product(String code, String name, double tax_rate, int tax_price, int non_tax_price) {
      this.code = code;
      this.name = name;
      this.tax_rate = tax_rate;
      this.tax_price = tax_price;
      this.non_tax_price = non_tax_price;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTax_rate() {
        return tax_rate;
    }
    public void setTax_rate(double tax_rate) {
        this.tax_rate = tax_rate;
    }
    public int getTax_price() {
        return tax_price;
    }
    public void setTax_price() {
        tax_price = non_tax_price+(int)(non_tax_price*(tax_rate/100));
    }
    public int getNon_tax_price() {
        return non_tax_price;
    }
    public void setNon_tax_price(int non_tax_price) {
        this.non_tax_price = non_tax_price;
    }
    
}

class ProductActions{
    static void genearateProducts(){
        Product product1 = new Product("p001", "ニンテンドースイッチ", 8.0, 32400 , 30000);
        Product product2 = new Product("p002", "メガドライブ", 8.0, 54000, 50000);

        System.out.println(product1.getCode()+" "+product1.getName()+" "+product1.getTax_rate()+" "+product1.getNon_tax_price()+" "+ product1.getTax_price());
        System.out.println(product2.getCode()+" "+product2.getName()+" "+product2.getTax_rate()+" "+product2.getNon_tax_price()+" "+ product2.getTax_price());
        System.out.println();
        
        product1.setName("任天堂スイッチ");
        product1.setTax_rate(10.0);
        product1.setTax_price();
        product2.setName("セガサターン");
        product2.setTax_rate(10.0);
        product2.setTax_price();
        System.out.println(product1.getCode()+" "+product1.getName()+" "+product1.getTax_rate()+" "+product1.getNon_tax_price()+" "+ product1.getTax_price());
        System.out.println(product2.getCode()+" "+product2.getName()+" "+product2.getTax_rate()+" "+product2.getNon_tax_price()+" "+ product2.getTax_price());


    }
}