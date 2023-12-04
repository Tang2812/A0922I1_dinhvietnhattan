package codegym.vn.service;

import codegym.vn.entity.KhachHang;
import codegym.vn.repo.KhachHangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    KhachHangRepo khachHangRepo;

    @Override
    public void save(KhachHang khachHang) {
        khachHangRepo.save(khachHang);
    }

    @Override
    public Page<KhachHang> findAll(Pageable pageable) {
        return khachHangRepo.findAll(pageable);
    }

    @Override
    public KhachHang findById(Integer id) {
        return khachHangRepo.findById(id).orElse(null);
    }

    @Override
    public boolean delete(Integer id) {
        if (!khachHangRepo.existsById(id)) {
            return false;
        } else {
            khachHangRepo.deleteById(id);
            return true;
        }

    }
}
