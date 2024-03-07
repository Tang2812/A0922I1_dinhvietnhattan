package service;

import model.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements  ProductService {
    ProductRepository service=new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() {
        return service.findAll();
    }
}
