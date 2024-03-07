package codedgym.vn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class DangKi {
@Id
    private int id;
@NotBlank(message = "Firstname khong duoc de trong")
    @Column(columnDefinition = "nvarchar(100)")
    private String  firstName;
    @NotBlank(message = "LastName khong duoc de trong")
    private String lastName;
@NotBlank(message = "So dien thoai khong duoc de trong")
    private String Sdt;
    @Min(18)
    private Integer  age;
    @NotBlank(message = "Email khong duoc de trong")
    private String  mail;

    public DangKi(int id, String firstName, String lastName, String sdt, Integer age, String mail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Sdt = sdt;
        this.age = age;
        this.mail = mail;
    }

    public DangKi() {
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
