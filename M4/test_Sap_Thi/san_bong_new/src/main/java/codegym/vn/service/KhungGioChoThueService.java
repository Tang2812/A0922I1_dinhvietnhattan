package codegym.vn.service;

import codegym.vn.entity.KhuVuc;
import codegym.vn.entity.KhungGioChoThue;

import java.util.List;

public interface KhungGioChoThueService {
    List<KhungGioChoThue> findAll();
    KhungGioChoThue findById(Integer id);
}
