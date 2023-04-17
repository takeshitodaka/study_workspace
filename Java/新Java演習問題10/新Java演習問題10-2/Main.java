//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        ExamActions.generateExam();
    }
}

class Exam {
    private String[] name;
    private int[] result;
    private boolean[] pass;
    public String[] getName() {
        return name;
    }
    public void setName(String[] name) {
        this.name = name;
    }
    public int[] getResult() {
        return result;
    }
    public void setResult(int[] result) {
        this.result = result;
    }
    public boolean[] getPass() {
        return pass;
    }
    public void setPass(boolean[] pass) {
        this.pass = pass;
    }

}

class ExamActions{
    static void generateExam(){
        Exam exam1 = new Exam();
        Exam exam2 = new Exam();

        exam1.setName(new String[] {"ICT入門", "Javaプロ", "Web技術基礎", "観光情報学入門"});
        exam1.setResult(new int[]{100, 10, 50, 80});
        exam1.setPass(new boolean[]{true, false, false, true});
        exam2.setName(new String[] {"哲学", "情報倫理", "ネットワーク基礎", "システム開発基礎2"});
        exam2.setResult(new int[]{70, 100, 30, 2 });
        exam2.setPass(new boolean[]{true, true, false, false});

        String outputVal="";
        for(String val: exam1.getName()){
            outputVal+=val+" ";
        }
        System.out.println(outputVal);
        
        outputVal = "";
        for(int val: exam1.getResult()){
            outputVal+=val+" ";
        }
        System.out.println(outputVal);
        
        outputVal = "";
        for(boolean val: exam1.getPass()){
            outputVal+=val+" ";
        }
        System.out.println(outputVal);
        
        outputVal = "";
        for(String val: exam2.getName()){
            outputVal+=val+" ";
        }
        System.out.println(outputVal);
        
        outputVal = "";
        for(int val: exam2.getResult()){
            outputVal+=val+" ";
        }
        System.out.println(outputVal);
        
        outputVal = "";
        for(boolean val: exam2.getPass()){
            outputVal+=val+" ";
        }
        System.out.println(outputVal);

    }
}