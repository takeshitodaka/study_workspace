//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        CountryActions.generateCountries();
    }
}
class Country {
    private String name;
    private int population;
    private int area;

    Country(){
        this("",0,0);
    }
    Country(String name){
        this(name,0,0);
    }
    Country(String name, int population){
        this(name,population,0);
    }
    Country(String name, int population, int area){
        this.name=name;
        this.population=population;
        this.area=area;
    }
    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    public int getArea() {
        return area;
    }
    
}
class CountryActions{
    static void generateCountries(){
        Country country1 = new Country();
        Country country2 = new Country("Japan");
        Country country3 = new Country("USA",327200000);
        Country country4 = new Country("UK",66440000,242500);

        
        printCountryInfo(country1);
        System.out.println();
        printCountryInfo(country2);
        System.out.println();
        printCountryInfo(country3);
        System.out.println();
        printCountryInfo(country4);
    }
    static void printCountryInfo(Country country){
        System.out.println("name:"+country.getName());
        System.out.println("population:"+country.getPopulation());
        System.out.println("area:"+country.getArea()+" m2");
    }
}