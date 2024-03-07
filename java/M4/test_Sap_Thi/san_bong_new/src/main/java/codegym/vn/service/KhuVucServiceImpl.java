package codegym.vn.service;

import codegym.vn.entity.KhuVuc;
import codegym.vn.repo.KhuVucRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhuVucServiceImpl implements KhuVucService{
    @Autowired
    KhuVucRepo khuVucRepo;
    @Override
    public List<KhuVuc> findAll() {
        return khuVucRepo.findAll();
    }

    @Override
    public KhuVuc findById(Integer id) {
        return khuVucRepo.findById(id).orElse(null);
    }
}
