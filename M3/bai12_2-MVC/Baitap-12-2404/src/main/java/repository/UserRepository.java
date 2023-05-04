package repository;

import model.User;

import java.sql.SQLException;
import java.util.List;
public interface UserRepository {
    List<User> findAll();
    void create(User user) throws SQLException;
    User findById(int id);
    void edit(int id,String name,String mail,String country);
    void delete(int id);
}
