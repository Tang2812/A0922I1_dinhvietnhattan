package codegym.vn.service;

import codegym.vn.entity.KhuVuc;
import codegym.vn.entity.LoaiSan;
import codegym.vn.entity.SanBong;
import codegym.vn.repo.SanBongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanBongServiceImpl implements SanBongService {
    @Autowired
    SanBongRepo sanBongRepo;
    @Autowired
    KhuVucService khuVucService;
    @Autowired
    LoaiSanService loaiSanService;
    @Autowired
    KhungGioChoThueService khungGioChoThueService;

    @Override
    public Page<SanBong> findAll(Pageable pageable) {
        return sanBongRepo.findAll(pageable);
    }

    @Override
    public SanBong findById(Integer id) {
        return sanBongRepo.findById(id).orElse(null);
    }

    @Override
    public boolean save(SanBong sanBong) {
        sanBongRepo.save(sanBong);
        return true;
    }

    @Override
    public boolean delete(Integer id) {

        if (!sanBongRepo.existsById(id)) {
            return false;
        }
        sanBongRepo.deleteById(id);
        return true;
    }

    @Override
    public Page<SanBong> findByName(String name, Pageable pageable) {
        return sanBongRepo.findByNameContaining(name, pageable);
    }

    @Override
    public Page<SanBong> findByKhuVuc(Integer id_khu_vuc, Pageable pageable) {

        return sanBongRepo.findByKhuVuc(khuVucService.findById(id_khu_vuc), pageable);
    }

    @Override
    public Page<SanBong> findByLoaiSan(Integer id_loai_san, Pageable pageable) {

        return sanBongRepo.findByLoaiSan(loaiSanService.findById(id_loai_san), pageable);
    }

    @Override
    public SanBong findByName2(String name) {
        return sanBongRepo.findByName(name);
    }

    @Override
    public Page<SanBong> findByAll(String name, Integer id_khu_vuc, Integer id_loai_san, Pageable pageable) {


        return sanBongRepo.findAllByLoaiSan_IdLoaiSanAndKhuVuc_IdKhuVucAndName(id_loai_san,id_khu_vuc,name,pageable);



    }

    @Override
    public Page<SanBong> findByAll1(String name, KhuVuc khuVuc, LoaiSan loaiSan, Pageable pageable) {
        return sanBongRepo.findAllByNameContainingAndKhuVucAndLoaiSan(name, khuVuc, loaiSan, pageable);
    }

    @Override
    public List<SanBong> findAllList() {
        return this.sanBongRepo.findAll();
    }


}
