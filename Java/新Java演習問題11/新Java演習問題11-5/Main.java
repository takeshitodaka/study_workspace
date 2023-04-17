//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        AwordActions.generateAwords();
    }
}

class Aword {
    private double length;
    private double weight;
    public Aword(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    
}

class AwordActions{
    static void generateAwords(){
        Aword aword1 = new Aword(0.1, 0.5);
        Aword aword2 = new Aword(2.3, 4.5);
        Aword aword3 = new Aword(5.6, 0.9);

        printAwordInfo(aword1);
        printAwordInfo(aword2);
        printAwordInfo(aword3);

        System.out.println();
        
        aword1.setLength(1.1);
        aword1.setWeight(2.3);
        aword2.setLength(5.6);
        aword2.setWeight(8.9);
        aword3.setLength(9.9);
        aword3.setWeight(1.1);
        printAwordInfo(aword1);
        printAwordInfo(aword2);
        printAwordInfo(aword3);
        
    }

    static void printAwordInfo(Aword aword){
        System.out.println(aword.getLength()+" "+aword.getWeight());
    }
}