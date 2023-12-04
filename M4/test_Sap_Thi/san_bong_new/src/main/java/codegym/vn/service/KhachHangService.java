package codegym.vn.service;

import codegym.vn.entity.KhachHang;
import codegym.vn.entity.SanBong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


public interface KhachHangService {
    void save(KhachHang khachHang);
    Page<KhachHang> findAll(Pageable pageable);
    KhachHang findById(Integer id);
    boolean delete(Integer id);

}
