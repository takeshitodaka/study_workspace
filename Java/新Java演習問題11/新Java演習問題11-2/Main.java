//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        RestaurantActions.generateRestaurant();
    }
}

class Restaurant{
    private String name;
    private String address;
    private int proceeds;
    private int countWorkers;
    public Restaurant(String name, String address, int proceeds, int countWorkers) {
        this.name = name;
        this.address = address;
        this.proceeds = proceeds;
        this.countWorkers = countWorkers;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getProceeds() {
        return proceeds;
    }
    public void setProceeds(int proceeds) {
        this.proceeds = proceeds;
    }
    public int getCountWorkers() {
        return countWorkers;
    }
    public void setCountWorkers(int countWorkers) {
        this.countWorkers = countWorkers;
    }
    
}

class RestaurantActions{
    static void generateRestaurant(){
        Restaurant restaurant1 = new Restaurant("ロイヤルホスト","福住",1000000, 20);
        printRestaurantInfo(restaurant1);
        
        restaurant1.setName("カーボーイ家族");
        restaurant1.setProceeds(500000);
        restaurant1.setCountWorkers(10);
        printRestaurantInfo(restaurant1);

    }

    static void printRestaurantInfo(Restaurant rest){
        System.out.println(rest.getName()+" "+rest.getAddress()+" "+rest.getProceeds()+" "+rest.getCountWorkers());

    }
}