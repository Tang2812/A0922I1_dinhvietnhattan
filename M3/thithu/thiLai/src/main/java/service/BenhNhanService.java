package service;

import model.BenhNhan;

import java.util.List;

public interface BenhNhanService {
    List<BenhNhan> findAll();
    BenhNhan findId(String id);
    void sua(BenhNhan benhNhan);
    void xoa(String id);


}
