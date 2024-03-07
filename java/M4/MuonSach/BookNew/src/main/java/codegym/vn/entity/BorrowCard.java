package codegym.vn.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BorrowCard {
    @Id
    private Integer borrow_card_id;
    @ManyToOne()
    @JoinColumn(name = "book_id")
    private Book book;
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    public Integer getBorrow_card_id() {
        return borrow_card_id;
    }

    public void setBorrow_card_id(Integer borrow_card_id) {
        this.borrow_card_id = borrow_card_id;
    }

    public BorrowCard(Integer borrow_card_id, Book book, User user) {
        this.borrow_card_id = borrow_card_id;
        this.book = book;
        this.user = user;
    }

    public BorrowCard() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
