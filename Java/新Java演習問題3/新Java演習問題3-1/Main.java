//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        BookAction.createBookObject();
        BookAction.printBookInfo();
    }
}
class Book {
    String subject; //題名
    String author; //作者
    int price; //価格

    public Book(){
        this.subject = "null";
        this.author = "null";
        this.price = 0;
    }
}

class BookAction{
    static Book book1;
    static void createBookObject(){
        book1= new Book();
    }
    static void printBookInfo(){
        System.out.println(
            "題名:"+book1.subject+"\n"
            +"作者:"+book1.author+"\n"
            + "価格:"+book1.price
        );
    }

}