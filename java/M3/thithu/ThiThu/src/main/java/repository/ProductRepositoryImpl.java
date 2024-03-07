package repository;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        ResultSet resultSet = null;
        try {

            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement
                    ("select ID,TenSanPham,Gia,SoLuong,MauSac,MoTa,TenDanhMuc from dbthi left join danhmuc on dbthi.idDanhMuc=danhmuc.idDanhMuc ");
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Product product = null;
                int id = resultSet.getInt(1);
                String tenSanPham = resultSet.getString(2);
                int gia = resultSet.getInt(3);
                int soLuong = resultSet.getInt(4);
                String mauSac = resultSet.getString(5);
                String moTa = resultSet.getString(6);
                String tenDanhMuc = resultSet.getString(7);
                product = new Product(id, tenSanPham, gia, soLuong, mauSac, moTa, tenDanhMuc);
                productList.add(product);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    @Override
    public void create(String name, int gia, int soLuong, String mauSac, String moTa, int DanhMuc) {
        ResultSet resultSet=null;
        try(
                Connection connection=DBConnection.getConnection();
                PreparedStatement statement=connection.prepareStatement("INSERT INTO `thithu`.`dbthi` (`TenSanPham`, `Gia`, `SoLuong`, `MauSac`, `MoTa`, `IdDanhMuc`) VALUES (?, ?, ?, ?,?, ?);");
                ) {
            statement.setString(1,name);
            statement.setInt(2,gia);
            statement.setInt(3,soLuong);
            statement.setString(4,mauSac);
            statement.setString(5,moTa);
            statement.setInt(6,DanhMuc);
            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product findById(int id) {

        return findAll().stream().filter(e->e.getId()==id).findFirst().get();
    }

    @Override
    public void edit(int id,String name, int gia, int soLuong, String mauSac, String moTa, int DanhMuc) {
        try(
                Connection connection=DBConnection.getConnection();
                PreparedStatement statement=connection.prepareStatement("UPDATE `thithu`.`dbthi` SET `TenSanPham` = ?, `Gia` = ?, `SoLuong` = ?, `MauSac` = ?, `MoTa` = ?, `IdDanhMuc` = ? WHERE (`ID` = ?);")
                ) {
            statement.setString(1,name);
            statement.setInt(2,gia);
            statement.setInt(3,soLuong);
            statement.setString(4,mauSac);
            statement.setString(5,moTa);
            statement.setInt(6,DanhMuc);
            statement.setInt(7,id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void xoa(int id) {
        try(            Connection connection=DBConnection.getConnection();
                        PreparedStatement statement=connection.prepareStatement("DELETE FROM `thithu`.`dbthi` WHERE (`ID` = ?);");) {
                statement.setInt(1,id);
                statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
