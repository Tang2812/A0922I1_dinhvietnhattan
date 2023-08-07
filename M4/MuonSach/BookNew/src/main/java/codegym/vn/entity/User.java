package codegym.vn.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
private Integer user_id;
    private String userName;

    public User(Integer user_id, String userName) {
        this.user_id = user_id;
        this.userName = userName;
    }

    public User() {
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer userId) {
        this.user_id = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
