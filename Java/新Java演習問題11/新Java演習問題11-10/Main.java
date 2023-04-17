class Dream {
    private String name;
    private String[] contents;
    private int[] possibility;
    public Dream(String name, String[] contents, int[] possibility) {
        this.name = name;
        this.contents = contents;
        this.possibility = possibility;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getContents() {
        return contents;
    }
    public void setContents(String[] contents) {
        this.contents = contents;
    }
    public int[] getPossibility() {
        return possibility;
    }
    public void setPossibility(int[] possibility) {
        int[] newValues = new int[possibility.length];

        for(int i =0; i<possibility.length;i++){
            if(possibility[i]<0){
                newValues[i]=0;
            }else{
                newValues[i]=possibility[i];

            }
        }
        this.possibility = newValues;
    }
    
}

public class Main {
    public static void main(String args[] ) throws Exception {
        Dream d1 = new Dream("自分",new String[]{"卒業","就職","海外勤務"},new int[]{100,90,30});
        Dream d2 = new Dream("友達",new String[]{"単位取得","進級","卒業"},new int[]{30,10,5});
        System.out.println(d1.getName()+" ");
        for(String s:d1.getContents()){
            System.out.print(s+" ");
        }
        System.out.println();
        for(int i:d1.getPossibility()){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(d2.getName()+" ");
        for(String s:d2.getContents()){
            System.out.print(s+" ");
        }
        System.out.println();
        for(int i:d2.getPossibility()){
            System.out.print(i+" ");
        }
        d1.setContents(new String[]{"卒業","起業","宇宙旅行"});
        d1.setPossibility(new int[]{100,100,50});
        d2.setContents(new String[]{"中退","芸能界入","セレブリティ"});
        d2.setPossibility(new int[]{-50,-30,50});
        System.out.println();
        System.out.println();
        System.out.println(d1.getName()+" ");
        for(String s:d1.getContents()){
            System.out.print(s+" ");
        }
        System.out.println();
        for(int i:d1.getPossibility()){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(d2.getName()+" ");
        for(String s:d2.getContents()){
            System.out.print(s+" ");
        }
        System.out.println();
        for(int i:d2.getPossibility()){
            System.out.print(i+" ");
        }
    }
}