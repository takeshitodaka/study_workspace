//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        ToolActions.generateTools();
    }
}

class Tool {
    private int number;
    private double weight;

    public Tool(int number, double weight) {
        this.number = number;
        this.weight = weight;
    }
    public Tool(int number) {
        this.number = number;
    }
    public Tool() {
    }
    public int getNumber() {
        return number;
    }
    public double getWeight() {
        return weight;
    }
    
}

class ToolActions{
    static void generateTools(){
        Tool tool1 = new Tool(1,70.3);
        Tool tool2 = new Tool();
        Tool tool3 = new Tool(3);

        printToolInfo(tool1);
        System.out.println();
        printToolInfo(tool2);
        System.out.println();
        printToolInfo(tool3);
    }
    static void printToolInfo(Tool tool){
        System.out.println("number:"+tool.getNumber());
        System.out.println("weight:"+tool.getWeight());
    }
}