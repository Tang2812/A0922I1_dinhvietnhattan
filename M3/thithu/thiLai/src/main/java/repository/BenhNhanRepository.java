package repository;

import model.BenhNhan;

import java.util.List;

public interface BenhNhanRepository {
    List<BenhNhan> findAll();
    BenhNhan findId(String id);
    void sua(BenhNhan benhNhan);
    void xoa(String id);
}
