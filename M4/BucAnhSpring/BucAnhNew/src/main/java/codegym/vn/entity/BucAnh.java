package codegym.vn.entity;

import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BucAnh {
    @Id
    private Integer id;
    @Column(columnDefinition = "Nvarchar(50)")
    private String auThor;
    private String comment;
    private Integer point;

    private Integer like_count;

    public BucAnh(Integer id, String auThor, String comment, Integer point) {
        this.id = id;
        this.auThor = auThor;
        this.comment = comment;
        this.point = point;
        this.like_count = 0;
    }

    public BucAnh() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuThor() {
        return auThor;
    }

    public void setAuThor(String auThor) {
        this.auThor = auThor;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getLike() {
        return like_count;
    }

    public void setLike(Integer like) {
        this.like_count = like;
    }
}
