package codegym.vn.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class LoaiSan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLoaiSan;
    @NotBlank(message = "khong duoc de trong")
    @Size(min = 5,message = "ten loai san qua ngan")
    @Size(max = 20,message = "ten loai san qua dai")
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
