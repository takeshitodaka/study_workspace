//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        CountryActions.generateCountry();
    }
}
class Country {
    private String name;
    private String[] city;
    private int[] city_population;
    public Country(String name, String[] city, int[] city_population) {
        this.name = name;
        this.city = city;
        this.city_population = city_population;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getCity() {
        return city;
    }
    public void setCity(String[] city) {
        this.city = city;
    }
    public int[] getCity_population() {
        return city_population;
    }
    public void setCity_population(int[] city_population) {
        this.city_population = city_population;
    }
}

class CountryActions{
    static void generateCountry(){
        Country country1 = new Country(
            "日本", 
            new String[]{"東京", "大阪", "名古屋", "福岡", "札幌", "京都", "仙台"}, 
            new int[]{500,300,350,150,200,80,60}
            );
        Country country2 = new Country(
            "アメリカ", 
            new String[]{"ニューヨーク", "ロスアンゼルス", "サンフランシスコ", "ワシントン", "シアトル"}, 
            new int[]{1000,500,300,200,100}
            );

            printCountryInfo(country1);
            printCountryInfo(country2);
            System.out.println();
            
            country1.setName("日本国");
            country1.setCity(new String[]{"東京都", "大阪府", "名古屋市", "福岡市", "札幌市", "京都市", "仙台市"});
            country1.setCity_population(new int[]{927,881,229,153,195,147,108});
            country2.setName("アメリカ合衆国");
            country2.setCity_population(new int[]{862,400,88,63,72});
            printCountryInfo(country1);
            printCountryInfo(country2);
    }
    static void printCountryInfo(Country country){
        String printVal ="";

        System.out.println(country.getName());
        for(String val: country.getCity()){
            printVal+=val+" ";
        }
        System.out.println(printVal);
        printVal="";
        for(int val: country.getCity_population()){
            printVal+=val+"万人 ";
        }
        System.out.println(printVal);
    }
}