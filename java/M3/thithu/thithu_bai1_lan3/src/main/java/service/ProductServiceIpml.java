package service;

import model.Product;

import java.util.List;

public class ProductServiceIpml implements ProductService{
    ProductService service=new ProductServiceIpml();
    @Override
    public List<Product> findAll() {
        return service.findAll();
    }
}
