//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Book book1 = new Book("ドラゴンボール", "鳥山明",350);
        book1.printBookInfo();
        book1.price +=100;
        book1.printBookInfo();
    }
}

class Book {
    String subject;
    String author;
    int price;
    public Book(String subject, String author, int price) {
        this.subject = subject;
        this.author = author;
        this.price = price;
    }
    void printBookInfo(){
        System.out.println(
            "題名:" + subject+"\n"
            +"作者:" + author+"\n"
            +"価格:" + price+"\n"
        );
    }

}