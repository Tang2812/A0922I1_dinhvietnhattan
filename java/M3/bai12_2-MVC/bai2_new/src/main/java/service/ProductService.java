package service;

import model.Product;

import java.util.List;

public interface ProductService {
public  List<Product> findAll();
public void create(Product product);
public void remove(int id);
public Product findById(int id);
public void edit(int id,String name,int price, String status, String producer);

}
