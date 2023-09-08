package codegym.vn.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class LoaiSan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLoaiSan;
    private String nameLoaiSan;

    @OneToMany  (mappedBy = "loaiSan")
    private List<SanBong> sanBongList;

    public LoaiSan(Integer id_loai_san, String loaiSan, List<SanBong> sanBongList) {
        this.idLoaiSan = id_loai_san;
        this.nameLoaiSan = loaiSan;
        this.sanBongList = sanBongList;
    }

    public LoaiSan() {
    }

    public Integer getIdLoaiSan() {
        return idLoaiSan;
    }

    public void setIdLoaiSan(Integer id_loai_san) {
        this.idLoaiSan = id_loai_san;
    }

    public String getNameLoaiSan() {
        return nameLoaiSan;
    }

    public void setNameLoaiSan(String loaiSan) {
        this.nameLoaiSan = loaiSan;
    }

    public List<SanBong> getSanBongList() {
        return sanBongList;
    }

    public void setSanBongList(List<SanBong> sanBongList) {
        this.sanBongList = sanBongList;
    }
}
