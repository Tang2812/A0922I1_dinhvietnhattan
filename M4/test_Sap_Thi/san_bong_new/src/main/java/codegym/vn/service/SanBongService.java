package codegym.vn.service;

import codegym.vn.entity.KhuVuc;
import codegym.vn.entity.LoaiSan;
import codegym.vn.entity.SanBong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SanBongService {
    Page<SanBong> findAll(Pageable pageable);
    SanBong findById(Integer id);
    boolean save(SanBong sanBong);
    boolean delete(Integer id);
    Page<SanBong> findByName(String name,Pageable pageable);
    Page<SanBong> findByKhuVuc(Integer id_khu_vuc,Pageable pageable);
    Page<SanBong> findByLoaiSan(Integer id_loai_san,Pageable pageable);
    SanBong findByName2(String name);
    Page<SanBong> findByAll(String name,Integer id_khu_vuc,Integer id_loai_san,Pageable pageable);
    Page<SanBong> findByAll1(String name, KhuVuc id_khu_vuc, LoaiSan id_loai_san, Pageable pageable);

    List<SanBong> findAllList();
}
