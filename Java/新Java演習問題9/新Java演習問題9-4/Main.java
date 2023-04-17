//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        StudentActions.generateStudents();
    }
}

class Student{
    int number;
    String name;

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        if(number<0){
            this.number=0;
        }else{
            this.number = number;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null){
            this.name="NoName";
        }else{
            this.name = name;
        }
    }

}
class StudentActions{
    static void generateStudents(){
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setNumber(1);
        student1.setName("鈴木一郎");
        student2.setNumber(2);
        student2.setName("田中次郎");
        student3.setNumber(-1);
        student3.setName(null);

        System.out.println(student1.getNumber()+" "+student1.getName());
        System.out.println(student2.getNumber()+" "+student2.getName());
        System.out.println(student3.getNumber()+" "+student3.getName());

    }
}