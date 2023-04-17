//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Book b1 = new Book("ジョジョの奇妙な物語", "ジョルノジョバーナ",1000);
        Book b2 = new Book("ワンピース", "ルフィ");
        BookActions.printBookInfo(b1);
        BookActions.printBookInfo(b2);
    }
}

class Book {
    String subject;  //題名
    String autor;  //作者
    int price;  //価格
    public Book(String subject, String author, int price){
        this.subject=subject;
        this.autor=author;
        this.price=price;
    }
    public Book(String subject, String author){
        this.subject=subject;
        this.autor=author;
        this.price=0;
    }
}

class BookActions{
    static void printBookInfo(Book book){
        System.out.println(
            "題名:"+book.subject+"\n"
            +"作者:"+book.autor+"\n"
            +"価格:"+book.price+"\n"
        );
    }
}