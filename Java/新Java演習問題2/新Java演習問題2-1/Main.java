//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Student student1 = new Student();
        student1.name="田中卓也";
        student1.number="s2101001";
        student1.faculty="経営情報学部";
        student1.depart="システム情報";
        student1.gpa=3.3;

        Student student2 = new Student();
        student2.name="鈴木純一";
        student2.number="s2101002";
        student2.faculty="医療情報学部";
        student2.depart="医療情報";
        student2.gpa=2.3;

        Student student3 = new Student();
        student3.name="大泉洋一";
        student3.number="s2101003";
        student3.faculty="情報メディア学部";
        student3.depart="情報メディア";
        student3.gpa=1.3;

        OutputStudent.printStudent(student1);
        OutputStudent.printStudent(student2);
        OutputStudent.printStudent(student3);

    }
}
class Student{
    String name;
    String number;
    String faculty;
    String depart;
    double gpa;

}

class OutputStudent{
    static void printStudent(Student student){
        System.out.println("氏名:"+ student.name + ", 学生番号:" + student.number + ", 学部:"+student.faculty+", 学科:"+student.depart+", GPA:"+student.gpa);
    }
}