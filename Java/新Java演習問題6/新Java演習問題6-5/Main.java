//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
      Timer myTimer= new Timer(15,5);
      Timer yourTimer = myTimer;
      yourTimer.printTimerInfo();
    }
}

class Timer {
    int interval; //反復間隔
    int num; //回数
    public Timer(int interval, int num) {
        this.interval = interval;
        this.num = num;
    }
    void printTimerInfo(){
        System.out.println(
            "反復間隔:"+interval+"\n"
            +"回数:"+num+"\n"
        );

    }
}