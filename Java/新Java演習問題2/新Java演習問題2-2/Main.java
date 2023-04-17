//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Car car1 = new Car();
        car1.name="プリウス";
        car1.age=2001;
        car1.type="セダン";
        car1.price=1000000;
        
        Car car2 = new Car();
        car2.name="カイエン";
        car2.age=2010;
        car2.type="SUV";
        car2.price=8000000;
        
        OutputCar.printCarInfo(car1);
        OutputCar.printCarInfo(car2);
        

    }
}

class Car {
    String name;
    int age;
    String type;
    int price;

}

class OutputCar{
    static void printCarInfo(Car car){
        System.out.println("車名:"+car.name+", 年式:"+car.age+", タイプ:"+car.type+", 価格:"+car.price);
    }
}