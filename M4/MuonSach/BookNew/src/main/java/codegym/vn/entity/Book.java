package codegym.vn.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
@Id
    private Integer book_id;
    private String bookName;
    private String author;
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Book(Integer book_id, String bookName, String author, Integer quantity) {
        this.book_id = book_id;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
    }



    public Book() {
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer bookId) {
        this.book_id = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
