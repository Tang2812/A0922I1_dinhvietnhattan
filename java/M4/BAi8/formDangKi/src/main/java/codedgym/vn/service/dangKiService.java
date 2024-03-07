package codedgym.vn.service;

import codedgym.vn.entity.DangKi;
import org.springframework.stereotype.Service;

import java.util.List;

public interface dangKiService {
    boolean create(DangKi dangKi);


    List<DangKi> findAll();

}
