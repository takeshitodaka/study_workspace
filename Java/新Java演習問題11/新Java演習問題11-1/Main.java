//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        HiuStudentActions.generateHiuStudents();
    }
}
class HiuStudent{
    private String id;
    private String name;
    private String department;
    private int grade;
    private int age;
    public HiuStudent(String id, String name, String department, int grade, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.grade = grade;
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setNextYear(){
        age += 1;
        grade += 1;
    }

}

class HiuStudentActions{
    static void generateHiuStudents(){
        HiuStudent hiuStudent1 = new HiuStudent("s1010101", "田中次郎", "先端経営学科", 1, 18);
        HiuStudent hiuStudent2 = new HiuStudent("s1000001", "鈴木三郎", "システム情報学科", 3, 20);

        System.out.println(hiuStudent1.getId()+" "+hiuStudent1.getName()+" "+hiuStudent1.getDepartment()+" "+hiuStudent1.getGrade()+" "+hiuStudent1.getAge());
        System.out.println(hiuStudent2.getId()+" "+hiuStudent2.getName()+" "+hiuStudent2.getDepartment()+" "+hiuStudent2.getGrade()+" "+hiuStudent2.getAge());

        System.out.println();

        hiuStudent1.setDepartment("情報メディア学科");
        hiuStudent2.setDepartment("医療情報学科");

        hiuStudent1.setNextYear();
        hiuStudent2.setNextYear();

        System.out.println(hiuStudent1.getId()+" "+hiuStudent1.getName()+" "+hiuStudent1.getDepartment()+" "+hiuStudent1.getGrade()+" "+hiuStudent1.getAge());
        System.out.println(hiuStudent2.getId()+" "+hiuStudent2.getName()+" "+hiuStudent2.getDepartment()+" "+hiuStudent2.getGrade()+" "+hiuStudent2.getAge());
        
    }
}