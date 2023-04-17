//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        HumanActions.generateHumans();
    }
}

class Human{
    private String name;
    private int birthday;
    private int manpukudo;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthday() {
        return birthday;
    }
    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    public int getManpukudo() {
        return manpukudo;
    }
    public void setManpukudo(int manpukudo) {
        this.manpukudo = manpukudo;
    }
}

class HumanActions{
    static void generateHumans(){
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();

        human1.setName("田中");
        human1.setBirthday(21);
        human1.setManpukudo(50);
        human2.setName("吉田");
        human2.setBirthday(35);
        human2.setManpukudo(10);
        human3.setName("樋口");
        human3.setBirthday(2);
        human3.setManpukudo(100);
        System.out.println("名前:"+human1.getName()+",年齢:"+ human1.getBirthday()+"歳,満腹度:"+human1.getManpukudo()+"%");
        System.out.println("名前:"+human2.getName()+",年齢:"+ human2.getBirthday()+"歳,満腹度:"+human2.getManpukudo()+"%");
        System.out.println("名前:"+human3.getName()+",年齢:"+ human3.getBirthday()+"歳,満腹度:"+human3.getManpukudo()+"%");
        
    }
}