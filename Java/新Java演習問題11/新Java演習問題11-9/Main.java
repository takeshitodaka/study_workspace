class Person {
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0 && age<=150){
            this.age = age;
        }else{
            this.age=-1;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex=='m'||sex=='f'){
            this.sex = sex;
        }else{
            this.sex='x';
        }
    }

    
}

public class Main {
    public static void main(String args[] ) throws Exception {
        Person p1 = new Person("山田孝之",35,'m');
        Person p2 = new Person("綾瀬はるか",30,'f');
        System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getSex());
        System.out.println(p2.getName()+" "+p2.getAge()+" "+p2.getSex());
        System.out.println();
        p1.setAge(-50);
        p1.setSex('g');
        p2.setAge(200);
        p2.setSex('m');
        System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getSex());
        System.out.println(p2.getName()+" "+p2.getAge()+" "+p2.getSex());
    }
}