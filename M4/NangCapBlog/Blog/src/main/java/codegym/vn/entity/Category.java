package codegym.vn.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Category")
public class Category {
    @Id
    @Column(name ="category_id" )
    private Integer categoryId;
@Column(name = "category_Name")
    private String categoryName;
@OneToMany(mappedBy = "category")
private List<Blog> blogs;

    public Category(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category() {
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
