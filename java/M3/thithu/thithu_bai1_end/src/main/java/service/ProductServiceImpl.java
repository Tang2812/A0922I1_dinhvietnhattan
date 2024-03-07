package service;

import model.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    ProductRepository service= new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() {
        return service.findAll();
    }

    @Override
    public void create(Product product) {
    service.create(product);
    }

    @Override
    public void delete(int id) {
service.delete(id);
    }

    @Override
    public List<Product> find(String string) {
        return service.find(string);
    }

    @Override
    public Product findByid(int id) {
        return service.findByid(id);
    }

    @Override
    public void edit(Product product) {
    service.edit(product);
    }
}
