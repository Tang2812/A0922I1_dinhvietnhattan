package codegym.vn.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class KhuVuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idKhuVuc;
    private String ten_khu_vuc;


    @OneToMany(mappedBy = "khuVuc")
    private List<SanBong> sanBongList;

    public KhuVuc(Integer id_khu_vuc, String ten_khu_vuc) {
        this.idKhuVuc = id_khu_vuc;
        this.ten_khu_vuc = ten_khu_vuc;
    }

    public KhuVuc() {
    }

    public Integer getIdKhuVuc() {
        return idKhuVuc;
    }

    public void setIdKhuVuc(Integer id_khu_vuc) {
        this.idKhuVuc = id_khu_vuc;
    }

    public String getTen_khu_vuc() {
        return ten_khu_vuc;
    }

    public void setTen_khu_vuc(String ten_khu_vuc) {
        this.ten_khu_vuc = ten_khu_vuc;
    }
}
