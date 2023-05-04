package repository;

import model.HoKhau;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoKhaurepositoryImpl implements HoKhauRepository{
    @Override
    public List<HoKhau> findAll() {
        List<HoKhau> hoKhauList=new ArrayList<>();
        try(
                Connection connection=DBConnection.getConnection();
                PreparedStatement statement=connection.prepareStatement("SELECT * FROM thithu_bai2.sohokhau;");
                ResultSet resultSet=statement.executeQuery();
                ) {
while (resultSet.next()){
int id=resultSet.getInt(1);
String maHoKhau=resultSet.getString(2);
String tenChuHo=resultSet.getString(3);
int soLuongThanhVien=resultSet.getInt(4);
String ngayLapHoKhau=resultSet.getString(5);
String diaChiNha=resultSet.getString(6);
HoKhau hoKhau=new HoKhau(id,maHoKhau,tenChuHo,soLuongThanhVien,ngayLapHoKhau,diaChiNha);
hoKhauList.add(hoKhau);
}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return hoKhauList;
    }
}
