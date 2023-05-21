package service;

import model.Sach;
import model.SachChoMuon;

import java.util.List;

public interface Sachservice {
    List<Sach> findAll();
    List<SachChoMuon> findAllSachChoMuon();
    Sach findById(int id);
    List<SachChoMuon> findId(String name);
    List<SachChoMuon> findHocSinh(String name);

//    void muonSach(SachChoMuon sachChoMuon);
}
