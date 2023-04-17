//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        TimerActions.generateTimer();
    }
}
class Timer {
    int seconds;

    int getSeconds(){
        return seconds;
    }

    void setSeconds(int s){
        seconds = s;
    }
}

class TimerActions{
    static void generateTimer(){
        Timer timer1 = new Timer();
        timer1.setSeconds(10);
        System.out.println("seconds="+timer1.getSeconds());
        timer1.setSeconds(50);
        System.out.println("seconds="+timer1.getSeconds());


    }
}