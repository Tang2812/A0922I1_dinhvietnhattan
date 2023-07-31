package codegym.vn.service;

import codegym.vn.entity.BucAnh;

import java.util.List;

public interface BucAnhService {
    List<BucAnh> findAll();
    BucAnh findById(Integer id);
    boolean create(BucAnh bucAnh);
    boolean like(Integer id);
}
