package codegym.vn.service;

import codegym.vn.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Integer id);
    boolean save(User user);

}
