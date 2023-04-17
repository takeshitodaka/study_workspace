//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        AnimalActions.generateAnimals();
    }
}

class Animal {
    private String name;
    private String food;
    private int age;
    public Animal(String name) {
        this.name = name;
    }
    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
    }
    public Animal(String name, String food, int age) {
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
    static void generateAnimals(){
        Animal animal1 = new Animal("taro", "apple", 4);
        Animal animal2 = new Animal("jiro","orange");
        Animal animal3 = new Animal("saburo");

        printAnimalInfo(animal1);
        printAnimalInfo(animal2);
        printAnimalInfo(animal3);

    }
    static void printAnimalInfo(Animal animal){
        System.out.println(animal.getName()+" "+animal.getFood()+" "+animal.getAge());
    }
}