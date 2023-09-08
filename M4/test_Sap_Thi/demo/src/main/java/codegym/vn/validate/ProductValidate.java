package codegym.vn.validate;

import codegym.vn.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ProductValidate implements Validator {
    @Autowired

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
if(target instanceof Product){
return;
}
Product product= (Product) target;
    }

}
