package service;

import model.Sach;
import model.SachChoMuon;
import repository.SachRepository;
import repository.SachRepositoryImpl;

import java.util.List;

public class SachServiceImpl implements Sachservice{
    SachRepository service=new SachRepositoryImpl();
    @Override
    public List<Sach> findAll() {
        return service.findAll();
    }

    @Override
    public List<SachChoMuon> findAllSachChoMuon() {
        return service.findAllSachChoMuon();
    }

    @Override
    public Sach findById(int id) {
        return service.findById(id);
    }

    @Override
    public List<SachChoMuon> findId(String name) {
        return service.findId(name);
    }

    @Override
    public List<SachChoMuon> findHocSinh(String name) {
        return service.findHocSinh(name);
    }
}
