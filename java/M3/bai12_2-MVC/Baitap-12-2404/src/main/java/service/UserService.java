package service;

import model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
void create(User user);
User findById(int id);
    void edit(int id,String name, String mail,String country);
    void delete(int id);
}

