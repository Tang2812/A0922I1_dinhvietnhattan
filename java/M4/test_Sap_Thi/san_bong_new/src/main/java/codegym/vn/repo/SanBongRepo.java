package codegym.vn.repo;

import codegym.vn.entity.KhuVuc;
import codegym.vn.entity.LoaiSan;
import codegym.vn.entity.SanBong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanBongRepo extends JpaRepository<SanBong,Integer> {
    Page<SanBong> findByNameContaining(String name, Pageable pageable);
    SanBong findByName(String name);
    Page<SanBong> findByKhuVuc(KhuVuc khuVuc,Pageable pageable);
    Page<SanBong> findByLoaiSan(LoaiSan loaiSan, Pageable pageable);
    Page<SanBong> findAllByLoaiSan_IdLoaiSanAndKhuVuc_IdKhuVucAndName(Integer id_loaiSan,Integer id_khuVuc,String name,Pageable pageable);
Page<SanBong> findAllByNameContainingAndKhuVucAndLoaiSan(String name,KhuVuc khuVuc,LoaiSan loaiSan,Pageable pageable);
}
