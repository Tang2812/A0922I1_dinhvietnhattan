package codegym.vn.service;

import codegym.vn.model.Product;
import codegym.vn.repo.impl.ProductRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductServiceIMPL implements ProductService {
    ProductRepositoryImpl repository=new ProductRepositoryImpl();
    @Override
    public boolean create(Product T) {
        return repository.create(T);
    }

    @Override
    public boolean update(Product T) {
        return repository.update(T);
    }

    @Override
    public Product findById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean deleteById(String id) {
        return repository.deleteById(id);
    }
}
