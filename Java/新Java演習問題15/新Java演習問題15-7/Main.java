//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
         
        SuperSaiyajin superSaiyajin1 = new SuperSaiyajin();
        superSaiyajin1.setName(sc.next());
        superSaiyajin1.setSkill(sc.next());

        System.out.println(
            "スーパーサイヤ人"+superSaiyajin1.getName()+"の技は"+superSaiyajin1.getSkill()
        );
    }
}

class Saiyajin {
    private String name;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
}

class SuperSaiyajin extends Saiyajin{
    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    

}