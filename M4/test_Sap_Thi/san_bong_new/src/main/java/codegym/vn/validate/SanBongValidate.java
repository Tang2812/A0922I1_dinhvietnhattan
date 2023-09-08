package codegym.vn.validate;

import codegym.vn.entity.SanBong;
import codegym.vn.service.SanBongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.List;

public class SanBongValidate implements Validator {
    @Autowired
    SanBongService sanBongService;

    private List<SanBong> sanBongList;

    public SanBongService getSanBongService() {
        return sanBongService;
    }

    public void setSanBongService(SanBongService sanBongService) {
        this.sanBongService = sanBongService;
    }

    public List<SanBong> getSanBongList() {
        return sanBongList;
    }

    public void setSanBongList(List<SanBong> sanBongList) {
        this.sanBongList = sanBongList;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (target instanceof SanBong) {
            return;
        }
        SanBong sanBong = (SanBong) target;
        for (SanBong s : this.sanBongList) {
            if (sanBong.equals(s.getName()) == true) {
                errors.rejectValue("name", "duplicate", null, "Khong duoc trung ten");
            break;
            }
        }

    }
}
