//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Student student1 = new Student(
                new String[] {"ICT入門", "Web技術基礎", "情報システムへの招待", "コンピュータ"},
                new String[] {"優", "秀", "可", "不可"},
                new int[] {3, 4, 1, 0}
            );
        Student student2 = new Student(
                new String[] {"哲学", "法学", "歴史学", "体育"},
                new String[] {"不可", "秀", "可", "可"}
            );
        Student student3 = new Student(
                new String[] {"データベース", "ネットワーク", "セキュリティ", "英語"}
            );
        StudentActions.printStudentInfo(student1);
        System.out.println("\n");
        StudentActions.printStudentInfo(student2);
        System.out.println("\n");
        StudentActions.printStudentInfo(student3);
    }
}
class Student {
    String[] subject;  //科目
    String[] grade;  //成績
    int[] gp;  //グレードポイント
    public Student(String[] subject, String[] grade, int[] gp){
        this.subject = subject;
        this.grade = grade;
        this.gp = gp;
    }
    public Student(String[] subject, String[] grade){
        this.subject = subject;
        this.grade = grade;
        this.gp = new int[] {0,0,0,0};
    }
    public Student(String[] subject){
        this.subject = subject;
        this.grade = new String[] {"不可", "不可", "不可", "不可"};
        this.gp = new int[] {0,0,0,0};
    }
}

class StudentActions{
    static void printStudentInfo(Student student){
        String subjects="";
        String grades="";
        String gps="";

        for(String sub: student.subject){
            subjects=subjects+sub+" ";
        }
        for(String grd: student.grade){
            grades=grades+grd+" ";
        }
        for(int val: student.gp){
            gps=gps+val+" ";
        }

        System.out.print(
            "科目:"+subjects+"\n"
            +"成績:"+grades+"\n"
            +"GP:"+gps
        );
    }
}
