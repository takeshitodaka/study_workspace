//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        CityActions.generateCities();
    }
}

class City {
    private String name;
    private int population;
    private String[] sightseeing;
    public City(String name, int population, String[] sightseeing) {
        this.name = name;
        this.population = population;
        this.sightseeing = sightseeing;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public String[] getSightseeing() {
        return sightseeing;
    }
    public void setSightseeing(String[] sightseeing) {
        this.sightseeing = sightseeing;
    }
    
}

class CityActions{

    static void generateCities(){
        City city1 = new City("札幌市",200 , new String[]{"大通り公園", "時計台", "テレビ塔", "北海道大学"});
        City city2 = new City("江別市",50 , new String[]{"EBRI", "町村農場", "野幌原生林"});

        printCityInfo(city1);
        printCityInfo(city2);
        System.out.println();
        
        city1.setPopulation(220);
        city2.setPopulation(60);
        
        city1.setSightseeing(new String[]{"大通り公園", "時計台", "テレビ塔", "北海道大学", "大通りビッセ", "ステラプレイス"});
        city2.setSightseeing(new String[]{"EBRI", "町村農場", "野幌原生林", "北海道情報大学", "かつや"});
        
        printCityInfo(city1);
        printCityInfo(city2);

    }
    static void printCityInfo(City city){
        System.out.println(city.getName());
        System.out.println(city.getPopulation()+"万人");

        String outSightSeeing ="";
        for(String val: city.getSightseeing()){
            outSightSeeing+=val+" ";
        }
        System.out.println(outSightSeeing);
    }
}