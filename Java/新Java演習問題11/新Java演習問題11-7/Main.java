//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        BookActions.generateBooks();
    }
}

class Book{
    private String name;
    private String author;
    private int price;
    
    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}

class BookActions{
    static void generateBooks(){
        Book book1 = new Book("坊ちゃん","芥川龍之介",300);
        Book book2 = new Book("羅生門","森鴎外",500);

        printBookInfo(book1);
        printBookInfo(book2);
        
        System.out.println();
        
        book1.setName("坊ちゃんZ");
        book1.setAuthor("夏目漱石");
        book1.setPrice(500);
        
        book2.setName("羅生門Seed");
        book2.setAuthor("芥川龍之介");
        book2.setPrice(800);

        printBookInfo(book1);
        printBookInfo(book2);
    }
    static void printBookInfo(Book book){
        System.out.println(book.getName()+" "+book.getAuthor()+" "+book.getPrice()+"円");
    }
}