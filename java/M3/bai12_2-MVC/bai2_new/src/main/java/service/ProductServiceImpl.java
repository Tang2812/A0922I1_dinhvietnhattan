package service;

import model.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository= new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();

    }

    @Override
    public void create(Product product) {
    productRepository.create(product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public Product findById(int id) {
     return    productRepository.findById(id);
    }

    @Override
    public void edit(int id, String name, int price, String status, String producer) {
        productRepository.edit(id,name,price,status,producer);
    }
}
