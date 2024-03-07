package repository;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository{
    List<Product> productList=new ArrayList<>();
    @Override
    public List<Product> findAll() {

        try( Connection connection=DBConnection.getConnection();
             PreparedStatement statement=connection.prepareStatement("select ID,TenSanPham,Gia,SoLuong,MauSac,MoTa,TenDanhMuc from dbthi left join danhmuc on dbthi.idDanhMuc=danhmuc.idDanhMuc;");
             ResultSet resultSet=statement.executeQuery();

        ){

            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String ten=resultSet.getString(2);
                int gia=resultSet.getInt(3);
                int soLuong=resultSet.getInt(4);
                String mauSac=resultSet.getString(5);
                String moTa=resultSet.getString(6);
                String danhMuc=resultSet.getString(7);
                Product product=new Product(id,ten,gia,soLuong,mauSac,moTa,danhMuc);
                productList.add(product);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
return productList;
    }
}
