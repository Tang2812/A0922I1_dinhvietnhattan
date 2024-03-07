package codegym.vn.entity;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Product {
    @Id
//    @GeneratedValue
    private Integer id;
    @NotBlank(message = "Ten khong duoc de trong")
   private String name;
//    @NotBlank(message = "Gia ban dau khong duoc de trong")
   private Integer startPrice;
    @NotBlank(message = "Status khong duoc de trong")
private String status;
@ManyToOne
@JoinColumn(name = "categoryId",referencedColumnName = "categoryId")
    Category category;

    public Product(Integer id, String name, Integer startPrice, String status, Category category) {
        this.id = id;
        this.name = name;
        this.startPrice = startPrice;
        this.status = status;
        this.category = category;
    }

    public Product(String name, Integer startPrice, String status, Category category) {
        this.name = name;
        this.startPrice = startPrice;
        this.status = status;
        this.category = category;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Integer startPrice) {
        this.startPrice = startPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
