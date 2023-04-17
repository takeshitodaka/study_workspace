//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Car c1 = new Car("ランボルギーニ",100,2020);
        CarActions.printCar(c1);
        c1.name="ランボルギーニ事故車";
        c1.price=40000000;
        CarActions.printCar(c1);
    }
}
class Car {
    String name;
    int distance;
    int year;
    int price;
    public Car(String name, int distance, int year){
        this.name=name;
        this.distance=distance;
        this.year=year;
        this.price=10000000;
    }
}

class CarActions{
    static void printCar(Car car){
        System.out.println(
            "車名:"+car.name+"\n"
            +"走行距離:"+car.distance+"キロ\n"
            +"年式:"+car.year+"年式\n"
            +"価格:"+car.price+"円\n"
        );
    }
}