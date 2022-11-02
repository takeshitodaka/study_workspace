import java.io.*;

class post02 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i, val;

        System.out.print("長さ：");
        val = Integer.parseInt(br.readLine());

        //ここからプログラムを記述してください。
        for(i=0;i<val;i++){
            if(i%4<2){
                System.out.print("+");
            }else{

                System.out.print("-");
            }
        }
        System.out.println("");
    }
}
