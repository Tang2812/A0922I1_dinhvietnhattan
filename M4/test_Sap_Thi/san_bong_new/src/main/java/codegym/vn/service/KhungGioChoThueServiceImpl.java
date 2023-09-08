package codegym.vn.service;

import codegym.vn.entity.KhungGioChoThue;
import codegym.vn.repo.KhungGioChoThueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhungGioChoThueServiceImpl implements KhungGioChoThueService{
    @Autowired
    KhungGioChoThueRepo khungGioChoThueRepo;
    @Override
    public List<KhungGioChoThue> findAll() {
        return khungGioChoThueRepo.findAll();
    }

    @Override
    public KhungGioChoThue findById(Integer id) {
        return khungGioChoThueRepo.findById(id).orElse(null);
    }
}
