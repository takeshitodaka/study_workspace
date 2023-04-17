//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Box box1 = new Box(70,3.2);
        Box box2 = new Box(150,2.8);
        Box box3 = new Box(270,7.1);
        Box box4 = new Box(90,3.0);
        Box box5 = new Box(310,4.5);
        Box box6 = new Box(180,3.7);
        Box box7 = new Box(120,1.5);

        Carrage carrage = new Carrage();
        carrage.add(box1);
        carrage.add(box2);
        carrage.add(box3);
        carrage.add(box4);
        carrage.add(box5);
        carrage.add(box6);
        carrage.add(box7);

        System.out.println(carrage.getTotal());
    }
}
class Box{
    private int size;
    private double weight;
    public Box(int size, double weight) {
        this.size = size;
        this.weight = weight;
    }
    public int getSize() {
        return size;
    }
    public double getWeight() {
        return weight;
    }
}
class Carrage{
    int total;
    void add(Box b){
        int basePrice = 200;
        if(b.getSize()<=100){
            if(b.getWeight()<=2.0){
                total+=500+basePrice;
            }else if(b.getWeight()<=5.0){
                total+=700+basePrice;
            }else{
                total+=1000+basePrice;
            }
        }else if(b.getSize()<=300){
            if(b.getWeight()<=2.0){
                total+=1000+basePrice;
            }else if(b.getWeight()<=5.0){
                total+=1200+basePrice;
            }else{
                total+=1500+basePrice;
            }
            
        }else if(b.getSize()>300){
            if(b.getWeight()<=2.0){
                total+=2000+basePrice;
            }else if(b.getWeight()<=5.0){
                total+=2200+basePrice;
            }else{
                total+=3000+basePrice;
            }

        }
    }
    int calc(Box b){
        int basePrice = 200;
        if(b.getSize()<=100){
            if(b.getWeight()<=2.0){
                return 500+basePrice;
            }else if(b.getWeight()<=5.0){
                return 700+basePrice;
            }else{
                return 1000+basePrice;
            }
        }else if(b.getSize()<=300){
            if(b.getWeight()<=2.0){
                return 1000+basePrice;
            }else if(b.getWeight()<=5.0){
                return 1200+basePrice;
            }else{
                return 1500+basePrice;
            }
            
        }else if(b.getSize()>300){
            if(b.getWeight()<=2.0){
                return 2000+basePrice;
            }else if(b.getWeight()<=5.0){
                return 2200+basePrice;
            }else{
                return 3000+basePrice;
            }

        }else{

            return 0;
        }

    }
    int getTotal(){
        return total;
    }
}