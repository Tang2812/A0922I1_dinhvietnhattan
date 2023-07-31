package codegym.vn.entity;

import javax.persistence.*;

@Entity
public class Blog {
@Id
    private Integer id;
private String header;
private String author;
@ManyToOne
@JoinColumn(name = "category_id",referencedColumnName = "category_id")
private Category category;
private String hastag;
private String content;

    public Blog(Integer id, String header, String author, Category category, String hastag, String content) {
        this.id = id;
        this.header = header;
        this.author = author;
        this.category = category;
        this.hastag = hastag;
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getHastag() {
        return hastag;
    }

    public void setHastag(String hastag) {
        this.hastag = hastag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
