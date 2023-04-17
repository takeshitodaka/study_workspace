//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Course course1 = new Course("ICT入門", 1, 2);
        Course course2 = new Course("観光情報学入門", 3, 2);
        Course course3 = new Course("Javaプログラミング", 2, 4);

        OutputCourses.printCourses(new Course[] {course1,course2,course3});

    }
}

class Course {
    String name;
    int opened;
    int credits;

    public Course(String name, int opened, int credits){
        this.name = name;
        this.opened = opened;
        this.credits = credits;
    }
}

class OutputCourses{
    static void printCourses(Course[] courses){
        for(Course course:courses){
            System.out.println("科目名:"+course.name+", 開講年度:"+course.opened+"年, 単位数:"+course.credits);
        }
    }

}