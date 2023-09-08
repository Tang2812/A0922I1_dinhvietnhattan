package codegym.vn.service;

import codegym.vn.entity.KhuVuc;
import codegym.vn.entity.LoaiSan;

import java.util.List;

public interface LoaiSanService {
    List<LoaiSan> findAll();
    LoaiSan findById(Integer id);
}
