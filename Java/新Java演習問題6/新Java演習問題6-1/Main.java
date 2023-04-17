//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Restaurant rest1 = new Restaurant();
        Restaurant rest2 = new Restaurant("HIUカフェ");
        Restaurant rest3 = new Restaurant("HIU食堂","学食");

        RestaurantActions.printRestaurantInfo(rest1);
        RestaurantActions.printRestaurantInfo(rest2);
        RestaurantActions.printRestaurantInfo(rest3);
    }
}
class Restaurant{
    String name;
    public Restaurant(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }
    String kind;
    public Restaurant(String name) {
        this.name = name;
    }
    public Restaurant() {
    }
    void printName(){
        System.out.println("店名:"+name);
    }
    void printKind(){
        System.out.println("種類:"+kind);

    }
}

class RestaurantActions{
    static void printRestaurantInfo(Restaurant restaurant){
        restaurant.printName();
        restaurant.printKind();
        System.out.println();
    }
}