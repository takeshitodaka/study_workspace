//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        ToppingNoodle toppingNoodle1 = new ToppingNoodle();
        toppingNoodle1.setFlavor("味噌");
        toppingNoodle1.setTopping("味玉");
        System.out.println(
            toppingNoodle1.getFlavor()+"ラーメン"+
            toppingNoodle1.getTopping()+"乗せ"
        );
    }
}
class Noodle {
    private String flavor;
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
    public String getFlavor(){
        return flavor;
    }
}
class ToppingNoodle extends Noodle{
    private String topping;

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    
}