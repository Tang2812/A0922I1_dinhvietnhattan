package repository;

import model.Sach;
import model.SachChoMuon;

import java.util.List;

public interface SachRepository {
    List<Sach> findAll();
    List<SachChoMuon> findAllSachChoMuon();
    Sach findById(int id);
//    void muonSach(SachChoMuon sachChoMuon);
List<SachChoMuon> findId(String name);
    List<SachChoMuon> findHocSinh(String name);

}
