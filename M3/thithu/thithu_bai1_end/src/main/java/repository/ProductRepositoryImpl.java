package repository;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository{
    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("select ID,TenSanPham,Gia,SoLuong,MauSac,MoTa,TenDanhMuc from dbthi left join danhmuc on dbthi.idDanhMuc=danhmuc.idDanhMuc;");
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String ten = resultSet.getString(2);
                int gia = resultSet.getInt(3);
                int soLuong = resultSet.getInt(4);
                String mauSac = resultSet.getString(5);
                String moTa = resultSet.getString(6);
                String danhMuc = resultSet.getString(7);
                Product product = new Product(id, ten, gia, soLuong, mauSac, moTa, danhMuc);
                productList.add(product);
            }
        }
            catch(SQLException e){
                throw new RuntimeException(e);
            }

        return productList;

    }

    @Override
    public void create(Product product) {
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("INSERT INTO `thithu`.`dbthi` (`TenSanPham`, `Gia`, `SoLuong`, `MauSac`, `MoTa`, `IdDanhMuc`) VALUES (?, ?, ?, ?,?, ?);");
        ) {
            statement.setString(1, product.getTen());
            statement.setInt(2, product.getGia());
            statement.setInt(3, product.getSoLuong());
            statement.setString(4, product.getMauSac());
            statement.setString(5, product.getMoTa());
            int idDanhmuc = -1;
            switch (product.getDanhMuc()) {
                case "Iphone":
                    idDanhmuc = 1;
                    break;
                case "Redmi":
                    idDanhmuc = 2;
                    break;

            }
            statement.setInt(6, idDanhmuc);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product findByid(int id) {
            return findAll().stream().filter(e -> e.getId() == id).findFirst().get();
    }

    @Override
    public void edit(Product product) {
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("UPDATE `thithu`.`dbthi` SET TenSanPham = ?, Gia = ?, SoLuong = ?, MauSac = ?, MoTa = ?, IdDanhMuc = ? WHERE (ID = ?);");
        ) {
            statement.setString(1, product.getTen());
            statement.setInt(2, product.getGia());
            statement.setInt(3, product.getSoLuong());
            statement.setString(4, product.getMauSac());
            statement.setString(5, product.getMoTa());
            int idDanhmuc = -1;
            switch (product.getDanhMuc()) {
                case "Iphone":
                    idDanhmuc = 1;
                    break;
                case "Redmi":
                    idDanhmuc = 2;
                    break;

            }
            statement.setInt(6, idDanhmuc);
            statement.setInt(7, product.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("DELETE FROM `thithu`.`dbthi` WHERE (`ID` = ?);");
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> find(String string) {
        System.out.println(string);
        List<Product> productList = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement("select ID,TenSanPham,Gia,SoLuong,MauSac,MoTa,TenDanhMuc from dbthi left join danhmuc on dbthi.idDanhMuc=danhmuc.idDanhMuc\n" +
                     "having TenSanPham like concat('%',?,'%');");

        ) {
            statement.setString(1,string);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String ten = resultSet.getString(2);
                int gia = resultSet.getInt(3);
                int soLuong = resultSet.getInt(4);
                String mauSac = resultSet.getString(5);
                String moTa = resultSet.getString(6);
                String danhMuc = resultSet.getString(7);
                Product product = new Product(id, ten, gia, soLuong, mauSac, moTa, danhMuc);
                productList.add(product);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(productList);
        return productList;
    }

}
