//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        SortActions.generateSort();
    }
}
class Sort{
    int[] num;

    public Sort(int[] num) {
        this.num = num;
    }
    void doSort(){
        int escapeVal;
        
        for(int i = num.length-1;i>0; i--){
            for(int j=0; j<i;j++){
                if (num[j]>num[j+1]){
                    escapeVal = num[j];
                    num[j] = num[j+1];
                    num[j+1] = escapeVal;
                }
            }
        }

    }
    void dispNum(){
        String dispVal = "";
        for(int val: num){
            dispVal+=val+" ";
        }
        System.out.println(dispVal);

    }
}

class SortActions{
    static void generateSort(){
        Sort sort1 = new Sort(new int[] {12,3,7,5,1});
        sort1.doSort();
        sort1.dispNum();

    }

}