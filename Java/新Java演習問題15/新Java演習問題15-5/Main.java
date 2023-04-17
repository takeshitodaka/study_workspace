//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        CustomCar customCar = new CustomCar();
        customCar.setName("フェラーリ");
        customCar.setYear(2020);
        customCar.setPrice(35000000);
        customCar.setCustomParts("エアロパーツ");
        customCar.setCustomColor("ロッソコルサ");

        System.out.println(
            customCar.getCustomParts()+"付き"+
            customCar.getName()+", "+
            customCar.getCustomColor()+", "+
            customCar.getYear()+"年式, "+
            customCar.getPrice()+"円"
        );

    }
}
class Car {
    private String name;
    private int year;
    private int price;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setYear(int year){
        this.year = year;
    }
    int getYear(){
        return year;
    }

    void setPrice(int price){
        this.price = price;
    }
    int getPrice(){
        return price;
    }

}
class CustomCar extends Car{
    private String customParts;
    private String customColor;
    public String getCustomParts() {
        return customParts;
    }
    public void setCustomParts(String customParts) {
        this.customParts = customParts;
    }
    public String getCustomColor() {
        return customColor;
    }
    public void setCustomColor(String customColor) {
        this.customColor = customColor;
    }
    
}