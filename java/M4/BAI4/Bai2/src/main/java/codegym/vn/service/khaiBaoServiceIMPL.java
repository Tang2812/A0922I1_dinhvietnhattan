package codegym.vn.service;

import codegym.vn.model.ToKhai;
import codegym.vn.repository.khaiBaoRepo;
import codegym.vn.repository.khaiBaoRepoIMPL;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class khaiBaoServiceIMPL implements khaiBaoService{
    khaiBaoRepo repo=new khaiBaoRepoIMPL();
    @Override
    public List<ToKhai> findAll() {
        return repo.findAll();
    }

    @Override
    public List<String> genderList() {
        return repo.genderList();
    }

    @Override
    public List<String> vehicleList() {
        return repo.vehicleList();
    }

    @Override
    public void create(ToKhai toKhai) {
        repo.create(toKhai);
    }

    @Override
    public boolean update(ToKhai toKhai) {
        return repo.update(toKhai);
    }

    @Override
    public ToKhai findByIdentifyCard(String ICard) {
        return repo.findByIdentifyCard(ICard);
    }
}
