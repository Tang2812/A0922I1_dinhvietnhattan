package codegym.vn.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blog {
@Id
    private Integer id;
private String header;
private String author;
private String hastag;
private String content;

    public Blog(Integer id, String author, String hastag,String header, String content) {
        this.id = id;
        this.header=header;
        this.author = author;
        this.hastag = hastag;
        this.content = content;
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
