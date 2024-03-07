package codegym.vn.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity

public class Blog {
    @Id
private Integer id;
@Column(columnDefinition = "nvarchar(100)")
private String nameAuthor;
private String content;
@ManyToOne
@JoinColumn(name="category_id",referencedColumnName = "category_id")
private Category category;
private String hagstag;
@DateTimeFormat(pattern = "dd/MM/yyyy")
private Date date;

    public Blog(Integer id, String nameAuthor, String content, Category category, String hagstag, Date date) {
        this.id = id;
        this.nameAuthor = nameAuthor;
        this.content = content;
        this.category = category;
        this.hagstag = hagstag;
        this.date = date;
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

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHagstag() {
        return hagstag;
    }

    public void setHagstag(String hagstag) {
        this.hagstag = hagstag;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
