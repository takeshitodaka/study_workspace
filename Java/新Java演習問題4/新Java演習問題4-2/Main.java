//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Student s1 = new Student("松崎しげる", 18);
        Student s2 = new Student("田中卓志", 19);
        Student s3 = new Student("木村拓三", 18);
        StudentActions.printStudent("s1", s1);
        StudentActions.printStudent("s2", s2);
        StudentActions.printStudent("s3", s3);
    }
}

class Student {
    String id;
    String name;
    int age;
    public Student(String name, int age){
        this.id="A0000";
        this.name=name;
        this.age=age;
    }
}

class StudentActions{
    static void printStudent(String name, Student student){
        System.out.println(name+"="+student.id+", "+student.name+", "+student.age);
    }
}