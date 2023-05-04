package service;

import model.HoKhau;
import repository.HoKhauRepository;
import repository.HoKhaurepositoryImpl;

import java.util.List;

public class HoKhauServiceImpl implements HoKhauService{
    HoKhauRepository service= new HoKhaurepositoryImpl();
    @Override
    public List<HoKhau> findAll() {
        return service.findAll();
    }
}
