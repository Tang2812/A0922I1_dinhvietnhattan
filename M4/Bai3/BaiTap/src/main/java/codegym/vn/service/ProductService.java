package codegym.vn.service;

import codegym.vn.model.Product;

import java.util.List;

public interface ProductService {
    boolean create(Product T);
    boolean update(Product T);
    Product findById(String id);
    List<Product> findAll();
    boolean deleteById(String id);
}
