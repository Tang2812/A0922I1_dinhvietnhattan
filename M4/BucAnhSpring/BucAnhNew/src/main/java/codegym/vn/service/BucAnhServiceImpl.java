package codegym.vn.service;

import codegym.vn.entity.BucAnh;
import codegym.vn.repo.BucAnhRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BucAnhServiceImpl implements BucAnhService{
    @Autowired
    BucAnhRepo service;
    @Override
    public List<BucAnh> findAll() {
        return (List<BucAnh>) service.findAll();
    }

    @Override
    public BucAnh findById(Integer id) {
        return service.findById(id).orElse(null);
    }

    @Override
    public boolean create(BucAnh bucAnh) {
        bucAnh.setLike(0);
        service.save(bucAnh);
        return true;
    }

    @Override
    public boolean like(Integer id) {
        if(service.existsById(id)){
            BucAnh bucAnhLiked= service.findById(id).orElse(null);
            bucAnhLiked.setLike(bucAnhLiked.getLike()+1);
            service.save(bucAnhLiked);
            return true;
        }
        return false;
    }
}
