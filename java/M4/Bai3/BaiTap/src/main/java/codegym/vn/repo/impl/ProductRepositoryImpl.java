package codegym.vn.repo.impl;

import codegym.vn.model.Product;
import codegym.vn.repo.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
static List<Product> productList=new ArrayList<>();
static {
    productList.add(new Product("1","iphone",100,"nice","apple"));
    productList.add(new Product("2","redmi",100,"good","realmi"));
    productList.add(new Product("3","samsung",100,"great","sumsum"));
    productList.add(new Product("4","laptop",100,"bad","apple"));
}
    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public boolean create(Product product) {
    if(productList.contains(product)){
    return false;
    }
    productList.add(product);
        return true;
    }

    @Override
    public boolean update(Product product) {
        if(productList.contains(findById(product.getId()))){
            productList.remove(findById(product.getId()));
            productList.add(product);
            return true;

    }
        return false;
    }

    @Override
    public Product findById(String id) {

        return findAll().stream().filter(e -> e.getId().equals(id)==true).findFirst().get();
    }

    @Override
    public boolean deleteById(String id) {
        if(productList.contains(findById(id))){
            productList.remove(findById(id));
            return true;

        }
        return false;
    }

}
