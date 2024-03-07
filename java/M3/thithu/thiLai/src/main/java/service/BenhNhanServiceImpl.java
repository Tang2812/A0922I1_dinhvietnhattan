package service;

import model.BenhNhan;
import repository.BenhNhanRepository;
import repository.BenhNhanRepositoryImpl;

import java.util.List;

public class BenhNhanServiceImpl implements BenhNhanService {
    BenhNhanRepository service=new BenhNhanRepositoryImpl();
    @Override
    public List<BenhNhan> findAll() {
        return service.findAll();
    }

    @Override
    public BenhNhan findId(String id) {
        return service.findId(id);
    }

    @Override
    public void sua(BenhNhan benhNhan) {
service.sua(benhNhan);
    }

    @Override
    public void xoa(String id) {
        service.xoa(id);
    }
}
