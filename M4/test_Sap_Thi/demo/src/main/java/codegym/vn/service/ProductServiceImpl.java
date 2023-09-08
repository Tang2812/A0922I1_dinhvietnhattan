package codegym.vn.service;

import codegym.vn.entity.Product;
import codegym.vn.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepo productRepo;
    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Page<Product> findAllPage(Pageable pageable) {
        return productRepo.findAll(pageable);
    }

    @Override
    public boolean save(Product product) {
        productRepo.save(product);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        if(productRepo.existsById(id)){
            productRepo.deleteById(id);
        }
        return true;
    }

}
