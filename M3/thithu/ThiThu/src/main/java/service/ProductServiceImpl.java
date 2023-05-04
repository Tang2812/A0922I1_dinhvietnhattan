package service;

import model.Product;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(String name, int gia, int soLuong, String mauSac, String moTa, int DanhMuc) {
        productRepository.create(name, gia, soLuong, mauSac, moTa, DanhMuc);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void edit(int id, String name, int gia, int soLuong, String mauSac, String moTa, int DanhMuc) {
        productRepository.edit(id, name, gia, soLuong, mauSac, moTa, DanhMuc);
    }

    @Override
    public void xoa(int id) {
        productRepository.xoa(id);
    }
}
