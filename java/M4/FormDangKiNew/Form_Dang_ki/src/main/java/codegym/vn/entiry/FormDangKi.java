package codegym.vn.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class FormDangKi {
    @Id
    private int id;

    @Column(columnDefinition = "nvarchar(100)")
    private String  firstName;

    private String lastName;

    private String Sdt;
    @Min(18)
    private Integer  age;

    private String  mail;

    public FormDangKi(int id, String firstName, String lastName, String sdt, Integer age, String mail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Sdt = sdt;
        this.age = age;
        this.mail = mail;
    }

    public FormDangKi() {
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
}
