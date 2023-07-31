package codedgym.vn.service;

import codedgym.vn.entity.DangKi;
import codedgym.vn.repo.dangkiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class dangKiServiceIMPL implements dangKiService{
    @Autowired
    private dangkiRepo dangkiRepo;
    @Override
    public boolean create(DangKi dangKi) {
        dangkiRepo.save(dangKi);
        return true;
    }

    @Override
    public List<DangKi> findAll() {
        return (List<DangKi>) dangkiRepo.findAll();
    }
}
