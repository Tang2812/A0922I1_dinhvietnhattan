package codegym.vn.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class KhungGioChoThue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_khung_gio;
@NotBlank(message = "khong duoc de trong")
    private String khung_gio;
    @NotBlank(message = "khong duoc de trong")
    @Min(10)
    @Max(1000)
    private Integer gia;
@OneToMany(mappedBy = "khungGioChoThue")
    List<SanBong> sanBongList;

    public KhungGioChoThue(Integer id_khung_gio, String khung_gio, Integer gia, List<SanBong> sanBongList) {
        this.id_khung_gio = id_khung_gio;
        this.khung_gio = khung_gio;
        this.gia = gia;
        this.sanBongList = sanBongList;
    }

    public Integer getId_khung_gio() {
        return id_khung_gio;
    }

    public void setId_khung_gio(Integer id_khung_gio) {
        this.id_khung_gio = id_khung_gio;
    }

    public String getKhung_gio() {
        return khung_gio;
    }

    public void setKhung_gio(String khung_gio) {
        this.khung_gio = khung_gio;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public List<SanBong> getSanBongList() {
        return sanBongList;
    }

    public KhungGioChoThue() {
    }

    public void setSanBongList(List<SanBong> sanBongList) {
        this.sanBongList = sanBongList;
    }
}
