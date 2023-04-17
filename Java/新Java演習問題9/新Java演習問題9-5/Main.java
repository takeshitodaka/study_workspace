//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        CarActions.generateCars();
    }
}

class Car{
    String name;
    int year;
    int price;
    public Car(String name, int year, int price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

class CarActions{
    static void generateCars(){
        Car car1 = new Car("noname",0,0);
        Car car2 = new Car("noname",0,0);
        Car car3 = new Car("noname",0,0);

        System.out.println(car1.getName()+", "+car1.getYear()+"年式, "+car1.getPrice()+"円");
        System.out.println(car2.getName()+", "+car2.getYear()+"年式, "+car2.getPrice()+"円");
        System.out.println(car3.getName()+", "+car3.getYear()+"年式, "+car3.getPrice()+"円");
        System.out.println();
        
        car1.setName("ソアラ");        
        car1.setYear(2000);        
        car1.setPrice(1000000);        
        car2.setName("セリカ");        
        car2.setYear(1998);        
        car2.setPrice(800000);        
        car3.setName("プレリュード");        
        car3.setYear(1987);        
        car3.setPrice(500000);        
        
        System.out.println(car1.getName()+", "+car1.getYear()+"年式, "+car1.getPrice()+"円");
        System.out.println(car2.getName()+", "+car2.getYear()+"年式, "+car2.getPrice()+"円");
        System.out.println(car3.getName()+", "+car3.getYear()+"年式, "+car3.getPrice()+"円");
    }
}