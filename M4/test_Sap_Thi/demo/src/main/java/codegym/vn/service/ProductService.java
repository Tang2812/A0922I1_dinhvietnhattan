package codegym.vn.service;

import codegym.vn.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Page<Product> findAllPage(Pageable pageable);
    boolean save(Product product);
    boolean delete(Integer id);
}
