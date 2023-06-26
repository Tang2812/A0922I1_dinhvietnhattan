package codegym.vn.service;

import codegym.vn.entity.Blog;

import java.util.List;

public interface BlogService {
    boolean create(Blog blog);
    boolean update(Blog blog);
    Blog  findById(int id);
    List<Blog> findAll();
    boolean deleteById(int id);
//    List<Blog> findProductByName(String name);
//    List<Blog> findProductByPrice(double min, double max);
    //    boolean create(Product product);
//    boolean update(Product product);
//    Product findById(int id);
//    List<Product> findAll();
//    boolean deleteById(int id);
//    List<Product> findProductByName(String name);
//    List<Product> findProductByPrice(double min, double max);
}
