//クラス名は必ずMainにする必要があります。
import java.lang.ref.Reference;
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Prefecture pre1= new Prefecture();
        Prefecture pre2= new Prefecture("北海道","179",83450.0);

        PrefectureActions.printPrefectureInfo(pre1);
        PrefectureActions.printPrefectureInfo(pre2);


        pre1.prefectureName="沖縄県";
        pre1.citiesCount="41";
        pre1.size=2281.0;
        PrefectureActions.printPrefectureInfo(pre1);
    }
}
class Prefecture{
    String prefectureName;
    String citiesCount;
    double size;
    
    public Prefecture(String prefectureName, String citiesCount, double size){
        this.prefectureName=prefectureName;
        this.citiesCount=citiesCount;
        this.size=size;
    }
    public Prefecture(){
        
    }
}

class PrefectureActions{
    static void printPrefectureInfo(Prefecture prefecture){
        System.out.println(
            "都道府県名:"+prefecture.prefectureName+"\n"
                +"市町村数:"+prefecture.citiesCount+"\n"
                +"面積:"+prefecture.size+"\n"
            );
    }
}