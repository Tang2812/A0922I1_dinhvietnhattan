package codegym.vn.service;

import codegym.vn.entity.Picture;
import codegym.vn.repo.PicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class PicServiceIMPL implements PicService{
@Autowired
    private PicRepo picRepo;
    @Override
    public boolean create(Picture t) {
    picRepo.save(t);
        return true;
    }

    @Override
    public boolean update(Picture t) {
if(picRepo.existsById(t.getId())){
    picRepo.save(t);
}
        return true;
    }

    @Override
    public Picture findById(Integer id) {

        return picRepo.findById(id).orElse(null);
    }

    @Override
    public List<Picture> findAll() {
        return (List<Picture>) picRepo.findAll();
    }

    @Override
    public boolean deleteById(Integer id) {
picRepo.deleteById(id);
        return true;
    }
}
