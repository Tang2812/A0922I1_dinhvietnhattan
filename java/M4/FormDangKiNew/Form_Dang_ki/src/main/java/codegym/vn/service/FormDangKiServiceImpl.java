package codegym.vn.service;

import codegym.vn.entiry.FormDangKi;
import codegym.vn.repo.FormDangKiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FormDangKiServiceImpl implements FormDangKiService{
    @Autowired
    FormDangKiRepo formDangKiRepo;
    @Override
    public List<FormDangKi> findAll() {
        return formDangKiRepo.findAll();
    }

    @Override
    public FormDangKi create(FormDangKi formDangKi) {
        return formDangKiRepo.save(formDangKi);
    }
}
