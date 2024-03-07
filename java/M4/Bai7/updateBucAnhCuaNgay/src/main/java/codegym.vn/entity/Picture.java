package codegym.vn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Picture {
    @Id
private int id;
    @Column(columnDefinition = "nvarchar(100)")
    private String nameAuthor;
    private String comment;
    private int diem;
    private int soLuongLike;

    public Picture(int id, String nameAuthor, String comment, int diem, int soLuongLike) {
        this.id = id;
        this.nameAuthor = nameAuthor;
        this.comment = comment;
        this.diem = diem;
        this.soLuongLike = soLuongLike;
    }
    public Picture(int id, String nameAuthor, String comment, int diem) {
        this.id = id;
        this.nameAuthor = nameAuthor;
        this.comment = comment;
        this.diem = diem;
        this.soLuongLike = 0;
    }

    public Picture() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public int getSoLuongLike() {
        return soLuongLike;
    }

    public void setSoLuongLike() {
        this.soLuongLike++;
    }
}
