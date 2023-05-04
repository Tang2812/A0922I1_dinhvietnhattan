package service;

import model.User;
import repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService{
    UserRepositoryImpl service=new UserRepositoryImpl();
    @Override
    public List<User> findAll() {
        return service.findAll();
    }

    @Override
    public void create(User user) {
        service.create(user);
    }

    @Override
    public User findById(int id) {
        return service.findById(id);
    }

    @Override
    public void edit(int id, String name, String mail, String country) {
        service.edit(id,name,mail,country);
    }

    @Override
    public void delete(int id) {
        service.delete(id);
    }
}
