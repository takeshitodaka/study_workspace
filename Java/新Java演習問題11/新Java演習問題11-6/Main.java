//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        AnimalActions.generateAnimals();
    }
}

class Animal {
    private String[] name;
    private String[] kind;
    private int[] age;
    
    public Animal(String[] name, String[] kind, int[] age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }
    public String[] getName() {
        return name;
    }
    public void setName(String[] name) {
        this.name = name;
    }
    public String[] getKind() {
        return kind;
    }
    public void setKind(String[] kind) {
        this.kind = kind;
    }
    public int[] getAge() {
        return age;
    }
    public void setAge(int[] age) {
        this.age = age;
    }
    
}

class AnimalActions{
    static void generateAnimals(){
        Animal animal = new Animal(
            new String[] {"ジョン", "ポチ", "ミケ", "タマ", "サブロー"},
            new String[] {"犬", "猫", "犬", "猫", "鳥"},
            new int[] {1, 2, 3, 4, 5}
        );
        printAnimalInfo(animal);

        System.out.println();
        
        animal.setName(new String[] {"パグ太郎", "ポチ", "ミケランジェロ", "タマゴロー", "タマサブロー"});
        animal.setKind(new String[] {"犬", "犬", "猫", "猫", "ネズミ"});
        animal.setAge(new int[] {5,4,3,2,1});
        
        printAnimalInfo(animal);
    }
    static void printAnimalInfo(Animal animal){
        String printVal="";
        for(String val:animal.getName()){
            printVal+=val+" ";
        }
        System.out.println(printVal);
        printVal="";
        for(String val:animal.getKind()){
            printVal+=val+" ";
        }
        System.out.println(printVal);
        printVal="";
        for(int val:animal.getAge()){
            printVal+=val+" ";
        }
        System.out.println(printVal);
    }
}