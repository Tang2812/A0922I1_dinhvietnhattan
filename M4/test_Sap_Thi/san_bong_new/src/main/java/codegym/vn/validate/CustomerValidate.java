package codegym.vn.validate;

import codegym.vn.entity.KhachHang;
import codegym.vn.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.List;

public class CustomerValidate implements Validator {
    @Autowired
    KhachHangService khachHangService;
    private List<KhachHang> khachHangList;

    public List<KhachHang> getKhachHangList() {
        return khachHangList;
    }

    public void setKhachHangList(List<KhachHang> khachHangList) {
        this.khachHangList = khachHangList;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (target instanceof KhachHang) {
            return;
        }
        KhachHang khachHang= (KhachHang) target;
    }
}
