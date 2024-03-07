package codegym.vn.service;

import codegym.vn.entity.Picture;
import codegym.vn.repository.PicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PicServiceImpl implements PicSerice {
    @Autowired
    PicRepository picRepository;

    @Override
    public boolean create(Picture picture) {
        picRepository.save(picture);
        return true;
    }

    @Override
    public boolean update(Picture picture) {
        if(picRepository.existsById(picture.getId())){
            picRepository.save(picture);
        }
        return false;
    }

    @Override
    public Picture findById(int id) {
        return picRepository.findById(id).orElse(null);
    }

    @Override
    public List<Picture> findAll() {
        return (List<Picture>) picRepository.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
