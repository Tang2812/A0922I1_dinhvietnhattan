package codegym.vn.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class SanBong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   @NotBlank(message = "Ten khong duoc de trong")
    private String name;
   @NotBlank(message = "Dia chi khong duoc de trong")
    private String diaChi;
    @ManyToOne
    @JoinColumn(name = "idKhuVuc", referencedColumnName = "idKhuVuc")
    private KhuVuc khuVuc;
    @ManyToOne
    @JoinColumn(name = "idLoaiSan", referencedColumnName = "idLoaiSan")
    private LoaiSan loaiSan;
    @ManyToOne
    @JoinColumn(name = "id_khung_gio",referencedColumnName = "id_khung_gio")
   private KhungGioChoThue khungGioChoThue;

    public SanBong() {
    }

    public SanBong( String name, String diaChi, KhuVuc khuVuc, LoaiSan loaiSan, KhungGioChoThue khungGioChoThue) {
        this.name = name;
        this.diaChi = diaChi;
        this.khuVuc = khuVuc;
        this.loaiSan = loaiSan;
        this.khungGioChoThue = khungGioChoThue;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public KhuVuc getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(KhuVuc khuVuc) {
        this.khuVuc = khuVuc;
    }

    public LoaiSan getLoaiSan() {
        return loaiSan;
    }

    public void setLoaiSan(LoaiSan loaiSan) {
        this.loaiSan = loaiSan;
    }

    @Override
    public String toString() {
        return "SanBong{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", khuVuc=" + khuVuc +
                ", loaiSan=" + loaiSan +
                ", khungGioChoThue=" + khungGioChoThue +
                '}';
    }

    public KhungGioChoThue getKhungGioChoThue() {
        return khungGioChoThue;
    }

    public void setKhungGioChoThue(KhungGioChoThue khungGioChoThue) {
        this.khungGioChoThue = khungGioChoThue;
    }
}
