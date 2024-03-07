package codegym.vn.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class FormDangKiDto implements Validator {

        private int id;
        @NotBlank(message = "Firstname khong duoc de trong")
        private String  firstName;
        @NotBlank(message = "LastName khong duoc de trong")
        private String lastName;
        @NotBlank(message = "So dien thoai khong duoc de trong")
        private String Sdt;
        @Min(18)
        private Integer  age;
        @NotBlank(message = "Email khong duoc de trong")
        private String  mail;

        public FormDangKiDto(int id, String firstName, String lastName, String sdt, Integer age, String mail) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            Sdt = sdt;
            this.age = age;
            this.mail = mail;
        }

        public FormDangKiDto() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSdt() {
            return Sdt;
        }

        public void setSdt(String sdt) {
            Sdt = sdt;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(!(target instanceof FormDangKiDto)){
            return;
        }
        FormDangKiDto formDangKiDto= (FormDangKiDto) target;

    }
}

