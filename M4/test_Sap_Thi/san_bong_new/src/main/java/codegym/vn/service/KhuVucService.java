package codegym.vn.service;

import codegym.vn.entity.KhuVuc;

import java.util.List;

public interface KhuVucService {
    List<KhuVuc> findAll();
    KhuVuc findById(Integer id);
}
