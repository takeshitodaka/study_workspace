//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        ComputerActions.generateComputer();
    }
}
class Computer {
    String cpu; //CPUの名称
    int memory; //メモリーサイズ
    int disk;  //ディスク装置の記憶容量
    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    public String getCpu() {
        return cpu;
    }
    public int getMemory() {
        return memory;
    }
    public int getDisk() {
        return disk;
    }
}
class ComputerActions{
    static void generateComputer(){
        Computer micro9 = new Computer("micro9",50,100);
        System.out.println(micro9.getCpu()+"/"+micro9.getMemory()+"GB/"+micro9.getDisk()+"TB"); 
    }
}