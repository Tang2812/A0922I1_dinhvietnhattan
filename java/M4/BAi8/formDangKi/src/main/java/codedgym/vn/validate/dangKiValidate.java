package codedgym.vn.validate;

import codedgym.vn.entity.DangKi;
import codedgym.vn.service.dangKiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
@Component
public class dangKiValidate implements Validator {
   @Autowired
    dangKiService  dangKiService;
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(!(target instanceof DangKi)){
            return;
        }
        DangKi dangKi= (DangKi) target;
        int dodaiTen=dangKi.getFirstName().length();
        if(dodaiTen<5||dodaiTen>45){
            errors.rejectValue("firstName","erorrNameLenght",null,"Do dai ten khong hop le");
        }
        int dodaiTen2=dangKi.getLastName().length();
        if(dodaiTen2<5||dodaiTen2>45){
            errors.rejectValue("lastName","erorrNameLenght",null,"Do dai ten khong hop le");
        }
        String sdt= dangKi.getSdt();
        if(sdt.length()!=11){
            errors.rejectValue("sdt","sdtLenght",null,"Do dai sdt khong hop le");
        }
        if(!sdt.startsWith("0")){
            errors.rejectValue("sdt","beginSdt",null,"Sdt bat dau bang0");
        }
        if(!sdt.matches("(^$|[0-9]*$)")){
            errors.rejectValue("number","numberFormat",null,"Dinh dang so dien thoai  loi");
        }
    }
}
