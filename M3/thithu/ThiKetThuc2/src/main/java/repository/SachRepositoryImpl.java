package repository;

import model.Sach;
import model.SachChoMuon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SachRepositoryImpl implements SachRepository {
    @Override
    public List<Sach> findAll() {
        List<Sach> sachList = new ArrayList<>();
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("select * from sach;");
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                int maSach = resultSet.getInt(1);
                String tenSach = resultSet.getString(2);
                String tenTacGia = resultSet.getString(3);
                String moTa = resultSet.getString(4);
                int soLuong = Integer.parseInt(resultSet.getString(5));
                Sach sach = new Sach(maSach, tenSach, tenTacGia, soLuong, moTa);
                sachList.add(sach);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return sachList;
    }

    @Override
    public List<SachChoMuon> findAllSachChoMuon() {
        List<SachChoMuon> sachChoMuonList = new ArrayList<>();
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("select themuonsach.MaMuonSach , sach.TenSach , sach.TacGia ,hocsinh.HoTen,hocsinh.Lop,themuonsach.ngayMuon,themuonsach.ngayTra from sach\n" +
                        "join themuonsach on sach.MaSach=themuonsach.MaSach\n" +
                        "join hocsinh on themuonsach.MaHocSinh=hocsinh.MaHocSinh;");
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
            int maMuonSach= resultSet.getInt(1);
            String tenSach= resultSet.getString(2);
            String tacGia=resultSet.getString(3);
            String hoTen=resultSet.getString(4);
            String lop=resultSet.getString(5);
            String ngayMuon=resultSet.getString(6);
            String ngayTra=resultSet.getString(7);
            SachChoMuon sachChoMuon=new SachChoMuon(maMuonSach,tenSach,tacGia,hoTen,lop,ngayMuon,ngayTra);
           sachChoMuonList.add(sachChoMuon);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        return sachChoMuonList;
    }

    @Override
    public Sach findById(int id) {
        return findAll().stream().filter(e -> e.getMaSach() == id).findFirst().get();
    }

    @Override
    public List<SachChoMuon> findId(String name) {
        List<SachChoMuon> sachList = new ArrayList<>();
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("select themuonsach.MaMuonSach , sach.TenSach , sach.TacGia ,hocsinh.HoTen,hocsinh.Lop,themuonsach.ngayMuon,themuonsach.ngayTra from sach\n" +
                        "join themuonsach on sach.MaSach=themuonsach.MaSach\n" +
                        "join hocsinh on themuonsach.MaHocSinh=hocsinh.MaHocSinh\n" +
                        "having sach.TenSach like concat('%',?,'%') ;");
        ) {
            statement.setString(1,name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int MaMuonSach = resultSet.getInt(1);
                String TenSach = resultSet.getString(2);
                String TacGia = resultSet.getString(3);
                String HoTen = resultSet.getString(4);
                String Lop = resultSet.getString(5);
                String ngayMuon=resultSet.getString(6);
                String ngayTra=resultSet.getString(7);
                SachChoMuon sach = new SachChoMuon(MaMuonSach, TenSach, TacGia, HoTen,Lop,ngayMuon,ngayTra);
                sachList.add(sach);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return sachList;
    }

    @Override
    public List<SachChoMuon> findHocSinh(String name) {
        List<SachChoMuon> sachList = new ArrayList<>();
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("select themuonsach.MaMuonSach , sach.TenSach , sach.TacGia ,hocsinh.HoTen,hocsinh.Lop,themuonsach.ngayMuon,themuonsach.ngayTra from sach\n" +
                        "join themuonsach on sach.MaSach=themuonsach.MaSach\n" +
                        "join hocsinh on themuonsach.MaHocSinh=hocsinh.MaHocSinh\n" +
                        "having hocsinh.HoTen like concat('%',?,'%') ;");
        ) {
            statement.setString(1,name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int MaMuonSach = resultSet.getInt(1);
                String TenSach = resultSet.getString(2);
                String TacGia = resultSet.getString(3);
                String HoTen = resultSet.getString(4);
                String Lop = resultSet.getString(5);
                String ngayMuon=resultSet.getString(6);
                String ngayTra=resultSet.getString(7);
                SachChoMuon sach = new SachChoMuon(MaMuonSach, TenSach, TacGia, HoTen,Lop,ngayMuon,ngayTra);
                sachList.add(sach);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return sachList;
    }

//    @Override
//    public void muonSach(SachChoMuon sachChoMuon) {
//        try (
//                Connection connection = DBConnection.getConnection();
//                PreparedStatement statement = connection.prepareStatement("INSERT INTO `thiketthuc`.`themuonsach` (`MaMuonSach`, `MaSach`, `MaHocSinh`, `Trang thai`, `ngayMuon`, `ngayTra`) VALUES (?, ? , ?, ?, ?, ?);");
//                ResultSet resultSet = statement.executeQuery();
//        ) {
//            statement.setInt(1,sachChoMuon.getMaMuonSach());
//            statement.setString(2,sachChoMuon.getTenSach());
//            statement.setString(3,sachChoMuon.getTacGia());
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}