//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        DataActions.generateData();
    }
}
class  Data {
    double x;
    Data(double a) {
        x=a;
    }
    double getX() {
        return x;
    }
    
}

class DataActions{
    static void generateData(){
        Data data1 = new Data(1.5);
        System.out.println(data1.getX());
    }
}