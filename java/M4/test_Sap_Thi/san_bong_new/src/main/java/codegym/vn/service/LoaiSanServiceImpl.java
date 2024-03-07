package codegym.vn.service;

import codegym.vn.entity.LoaiSan;
import codegym.vn.repo.LoaiSanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoaiSanServiceImpl implements LoaiSanService{
    @Autowired
    LoaiSanRepo loaiSanRepo;
    @Override
    public List<LoaiSan> findAll() {
        return loaiSanRepo.findAll();
    }

    @Override
    public LoaiSan findById(Integer id) {
        return loaiSanRepo.findById(id).orElse(null);
    }
}
