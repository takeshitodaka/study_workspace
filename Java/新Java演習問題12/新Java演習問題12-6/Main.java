//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        AnimalActions.generateAnimal();
    }
}
class Animal {
    private String name;
    private String food;
    private int age;

    Animal(String name){
        this(name, "", 0);
    }

    Animal(String name, String food){
        this(name, food, 0);
    }

    Animal(String name, String food, int age){
        this.name = name;
        this.food = food;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public int getAge() {
        return age;
    }

}

class AnimalActions{
    static void generateAnimal(){
        Animal animal1 = new Animal("dog","meat",3);
        Animal animal2 = new Animal("cat","fish");
        Animal animal3 = new Animal("rat");

        printAnimalInfo(animal1);
        System.out.println();
        printAnimalInfo(animal2);
        System.out.println();
        printAnimalInfo(animal3);
    }
    static void printAnimalInfo(Animal animal){
        System.out.println("name:"+animal.getName());
        System.out.println("food:"+animal.getFood());
        System.out.println("age:"+animal.getAge());

    }
}