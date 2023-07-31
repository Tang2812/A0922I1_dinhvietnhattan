package codegym.vn.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@NamedQueries({
        @NamedQuery(name = "findProductByName",
        query = "select p from Product p where p.name like '%:name%'")
})
public class Product {
    @Id
    private int id;
    @NotBlank(message = "Name không được để trống")
    @Column(columnDefinition = "nvarchar(100)")
    private String name;


    private double startPrice;
    @NotBlank(message = "Status không được để trống")
    @Column(columnDefinition = "nvarchar(100)")
    private String status;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    public Product() {
    }

    public Product(int id, String name, double startPrice, String status, Category category) {
        this.id = id;
        this.name = name;
        this.startPrice = startPrice;
        this.status = status;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
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
