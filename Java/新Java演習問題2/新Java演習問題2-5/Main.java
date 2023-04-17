//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        StundentsActions.createStudents();
        StundentsActions.calcGpa();
        StundentsActions.printStudentsInfo();

    }
}

class Student {
    String id; //学生番号
    String name; //氏名
    String[] takingclass; //履修科目
    int[] gp; //グレードポイント
}

class StundentsActions{
    static Student student1;
    static Student student2;
    static double student1Gpa = 0.0;
    static double student2Gpa = 0.0;
    
    static void createStudents(){
        student1 = new Student();
        student2 = new Student();

        student1.id="s001";
        student1.name="アムロ・レイ";
        student1.takingclass=new String[] {"離散数学","情報倫理","プログラム入門","法学","哲学"};
        student1.gp=new int[] {1,4,2,3,2};

        student2.id="s002";
        student2.name="シャア・アズナブル";
        student2.takingclass=new String[] {"モビルスーツ入門","歴史","ジオン入門","ニュータイプ基礎","ミノフスキー粒子論"};
        student2.gp=new int[] {4,4,4,4,4};

    }

    static void calcGpa(){
        for(int gpVal:student1.gp){
            student1Gpa=student1Gpa+gpVal;
        }
        student1Gpa = student1Gpa/student1.gp.length;
        for(int gpVal:student2.gp){
            student2Gpa=student2Gpa+gpVal;
        }
        student2Gpa = student2Gpa/student2.gp.length;
    }

    static void printStudentsInfo(){
        String outStudent1TakingClasses="";
        String outStudent1Gp="";
        String outStudent2TakingClasses="";
        String outStudent2Gp="";

        for(String className:student1.takingclass){
            outStudent1TakingClasses = outStudent1TakingClasses+className + " ";
        }
        for(int gpVal:student1.gp){
            outStudent1Gp = outStudent1Gp + gpVal + " ";
        }
        for(String className:student2.takingclass){
            outStudent2TakingClasses = outStudent2TakingClasses+className + " ";
        }
        for(int gpVal:student2.gp){
            outStudent2Gp = outStudent2Gp + gpVal + " ";
        }

        System.out.println(
            "学生番号:"+student1.id+"\n"
            +"氏名:"+student1.name+"\n"
            +"履修科目:{"+outStudent1TakingClasses+"}\n"
            +"GP:{"+outStudent1Gp+"}\n"
            +"GPA:"+student1Gpa+"\n"
        );
        System.out.println(
            "学生番号:"+student2.id+"\n"
            +"氏名:"+student2.name+"\n"
            +"履修科目:{"+outStudent2TakingClasses+"}\n"
            +"GP:{"+outStudent2Gp+"}\n"
            +"GPA:"+student2Gpa+"\n"
        );
    }
}