//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Student student = new Student();
        student.setName("北海道情報大学");
        student.setCity("江別市");
        student.setStudentName("山田太郎");
        student.setAge(19);

        System.out.println(
            student.getCity()+"にある"+
            student.getName()+"の"+
            student.getStudentName()+"君"+
            student.getAge()+"才"
        );
    }
}

class University {
    private String name;
    private String city;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setCity(String city){
        this.city = city;
    }
    String getCity(){
        return city;
    }
}
class Student extends University{
    private String studentName;
    private int age;
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}