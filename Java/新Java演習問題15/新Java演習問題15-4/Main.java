//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        ObjectProgram objprogram1 = new ObjectProgram();
        objprogram1.setContents("「プログラミング」");
        objprogram1.setFeature("「オブジェクト指向」");
        System.out.println(
            objprogram1.getFeature()+objprogram1.getContents()+
            "の特徴は"+ objprogram1.getFeature()+"であることです"
        );
        

    }
}
class Program {
    private String contents;
    void setContents(String contents){
        this.contents = contents;
    }
    String getContents(){
        return contents;
    }
}
class ObjectProgram extends Program{
    private String feature;

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
    
}