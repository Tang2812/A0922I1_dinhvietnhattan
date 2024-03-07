package service;

import model.Product;

import java.util.List;

public  interface ProductService {
List<Product> findAll();
void create(String name,int gia,int soLuong,String mauSac,String moTa,int DanhMuc);
Product findById(int id);
void edit(int id,String name,int gia,int soLuong,String mauSac,String moTa,int DanhMuc);
void xoa(int id);

}
