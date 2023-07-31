package codegym.vn.service;

import codegym.vn.entiry.FormDangKi;

import java.util.List;

public interface FormDangKiService {
    List<FormDangKi> findAll();
    FormDangKi create(FormDangKi formDangKi);
}
