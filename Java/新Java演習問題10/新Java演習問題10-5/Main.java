//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        UsedCarActions.generateUsedCars();
    }
}

class UsedCar {
    private String name;
    private int year;
    private String color;
    private String[] owners;
    public UsedCar(String name, int year, String color, String[] owners) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.owners = owners;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String[] getOwners() {
        return owners;
    }
    public void setOwners(String[] owners) {
        this.owners = owners;
    }

}

class UsedCarActions{
    static void generateUsedCars(){
        UsedCar usedCar1 = new UsedCar("フェラーリ", 2019, "ロッソコルサ", new String[]{"前澤"});
        printUsedCarInfo(usedCar1);
        
        System.out.println();

        usedCar1.setOwners(new String[]{"前澤", "剛力", "ガリバー"});
        printUsedCarInfo(usedCar1);
    }
    static void printUsedCarInfo(UsedCar target){
        System.out.println("車名:"+target.getName());
        System.out.println("年式:"+target.getYear());
        System.out.println("色:"+target.getColor());

        String outVal ="";
        for(String val: target.getOwners()){
            outVal += val+" ";
        }

        System.out.println("オーナー:"+outVal);
    }
}