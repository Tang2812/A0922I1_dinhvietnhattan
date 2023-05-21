package repository;

import model.BenhNhan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanRepositoryImpl implements BenhNhanRepository {
    @Override
    public List<BenhNhan> findAll() {
        List<BenhNhan> benhNhanList = new ArrayList<>();
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("select benhan.maBenhAn,benhnhan.maBenhNhan,benhnhan.tenBenhNhan,benhnhan.ngayNhapVien,benhnhan.ngayRaVien,benhnhan.liDoNhapVien from benhnhan\n" +
                        "join benhan on benhan.maBenhNhan=benhnhan.maBenhNhan");
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                String maBenhAn = resultSet.getString(1);
                String maBenhNhan = resultSet.getString(2);
                String tenBenhNhan = resultSet.getString(3);
                String ngayNhapVien = resultSet.getString(4);
                String ngayRaVien = resultSet.getString(5);
                String lyDoNhapVien = resultSet.getString(6);
                BenhNhan benhNhan = new BenhNhan(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
                benhNhanList.add(benhNhan);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return benhNhanList;
    }

    @Override
    public BenhNhan findId(String id) {
        BenhNhan benhNhan = null;
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("select benhan.maBenhAn,benhnhan.maBenhNhan,benhnhan.tenBenhNhan,benhnhan.ngayNhapVien,benhnhan.ngayRaVien,benhnhan.liDoNhapVien from benhnhan\n" +
                        "join benhan on benhan.maBenhNhan=benhnhan.maBenhNhan\n" +
                        "where benhan.maBenhAn = ? ; ");

        ) {
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String maBenhAn = resultSet.getString(1);
                String maBenhNhan = resultSet.getString(2);
                String tenBenhNhan = resultSet.getString(3);
                String ngayNhapVien = resultSet.getString(4);
                String ngayRaVien = resultSet.getString(5);
                String lyDoNhapVien = resultSet.getString(6);
                benhNhan = new BenhNhan(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return benhNhan;
    }

    @Override
    public void sua(BenhNhan benhNhan) {
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("UPDATE `thilai`.`benhnhan` SET `tenBenhNhan` = ?, `ngayNhapVien` = ?, `ngayRaVien` = ?, `liDoNhapVien` = ? WHERE (`maBenhNhan` = ?);");
        ) {
            statement.setString(1, benhNhan.getTenBenhNhan());
            statement.setString(2, benhNhan.getNgayNhapVien());
            statement.setString(3, benhNhan.getNgayRaVien());
            statement.setString(4, benhNhan.getLyDoNhapVien());
            statement.setString(5, benhNhan.getMaBenhAn());
            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void xoa(String id) {
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement("DELETE FROM `thilai`.`benhan` WHERE (`maBenhAn` = ?);");
        ) {
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
