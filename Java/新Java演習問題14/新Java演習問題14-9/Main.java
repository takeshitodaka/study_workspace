//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Student[] students = new Student[]{new Student(23001,"田中宏"),new Student(23002,"佐藤良子"),new Student(23003,"鈴木大輔")};
        for(Student student:students){
            System.out.println(student.toStr());
        }
    }
}
class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    String toStr(){
        return "Student class:"+id+":"+name;
    }
}