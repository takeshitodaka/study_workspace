//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        HiuStudentActions.generateHiuStudents();
    }
}
class HiuStudent {
    private String id;
    private String name;
    private String division;
    private String[] monday;
    private String[] tuesday;
    private String[] wednesday;
    private String[] thursday;
    private String[] friday;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public String[] getMonday() {
        return monday;
    }
    public void setMonday(String[] monday) {
        this.monday = monday;
    }
    public String[] getTuesday() {
        return tuesday;
    }
    public void setTuesday(String[] tuesday) {
        this.tuesday = tuesday;
    }
    public String[] getWednesday() {
        return wednesday;
    }
    public void setWednesday(String[] wednesday) {
        this.wednesday = wednesday;
    }
    public String[] getThursday() {
        return thursday;
    }
    public void setThursday(String[] thursday) {
        this.thursday = thursday;
    }
    public String[] getFriday() {
        return friday;
    }
    public void setFriday(String[] friday) {
        this.friday = friday;
    }
    
}
class HiuStudentActions{
    static void generateHiuStudents(){
        HiuStudent hiuStudent1= new HiuStudent();
        HiuStudent hiuStudent2= new HiuStudent();

        hiuStudent1.setId("s00001");
        hiuStudent1.setName("情報太郎");
        hiuStudent1.setDivision("システム情報学科");
        hiuStudent1.setMonday(new String[] {"月曜日", "ICT入門", "なし", "なし", "プログラム基礎", "情報倫理"});
        hiuStudent1.setTuesday(new String[] {"火曜日", "Web技術基礎", "哲学", "なし", "情報システムへの招待", "なし"});
        hiuStudent1.setWednesday(new String[] {"水曜日", "なし", "線形代数", "以降なし"});
        hiuStudent1.setThursday(new String[] {"木曜日", "全休"});
        hiuStudent1.setFriday(new String[] {"金曜日", "ゼミナール1", "ゼミナール2", "なし", "キャリアサポート"});
        hiuStudent2.setId("s00002");
        hiuStudent2.setName("大学花子");
        hiuStudent2.setDivision("医療情報学科");
        hiuStudent2.setMonday(new String[] {"月曜日", "医学概論", "ICT入門", "なし", "メディカルクラーク入門", "臨床工学基礎"});
        hiuStudent2.setTuesday(new String[] {"火曜日", "全休"});
        hiuStudent2.setWednesday(new String[] {"水曜日", "看護学入門", "生物学", "介護論", "診療情報管理基礎", "なし"});
        hiuStudent2.setThursday(new String[] {"木曜日", "体育", "ビギナーズセミナー", "キャリアサポート", "以降無し"});
        hiuStudent2.setFriday(new String[] {"金曜日", "情報学入門", "薬学", "販売士入門", "医療事務概論", "なし"});

        System.out.println(hiuStudent1.getId()+" "+hiuStudent1.getName()+" "+hiuStudent1.getDivision());
        System.out.println(generateStringFromStringArray(hiuStudent1.getMonday()));
        System.out.println(generateStringFromStringArray(hiuStudent1.getTuesday()));
        System.out.println(generateStringFromStringArray(hiuStudent1.getWednesday()));
        System.out.println(generateStringFromStringArray(hiuStudent1.getThursday()));
        System.out.println(generateStringFromStringArray(hiuStudent1.getFriday()));
        
        System.out.println();
        System.out.println(hiuStudent2.getId()+" "+hiuStudent2.getName()+" "+hiuStudent2.getDivision());
        System.out.println(generateStringFromStringArray(hiuStudent2.getMonday()));
        System.out.println(generateStringFromStringArray(hiuStudent2.getTuesday()));
        System.out.println(generateStringFromStringArray(hiuStudent2.getWednesday()));
        System.out.println(generateStringFromStringArray(hiuStudent2.getThursday()));
        System.out.println(generateStringFromStringArray(hiuStudent2.getFriday()));
        

    }

    static String generateStringFromStringArray(String stringArr[]){
        String outputVal="";

        for(String val:stringArr){
            outputVal += val+" ";
        }

        return outputVal;
    }
}