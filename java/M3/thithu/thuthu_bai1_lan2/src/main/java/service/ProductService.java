package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void create(Product product);
    Product findByid(int id);
    void edit(Product product);
    void delete(int id);
    List<Product> find(String string);
}
