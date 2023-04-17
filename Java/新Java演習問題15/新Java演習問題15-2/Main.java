//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        ColorBall colorBall1= new ColorBall();
        colorBall1.setSize(20);
        colorBall1.setColor(128);
        System.out.println("size="+colorBall1.getSize()+":color="+colorBall1.getColor());
    }
}
class Ball {
    private int size;
    void setSize(int size) {
        if(size>0) this.size=size;
    }
    int getSize() {
        return size;
    }
}
class ColorBall extends Ball{
    private int color;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        if(color<0 || color>255){
            this.color = 0;
        }else{
            this.color = color;
        }
    }

}