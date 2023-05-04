package repository;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
public static List<User> userList=new ArrayList<>();
    @Override
    public List<User> findAll() {
        Connection connection=DBConnection.getConnection();
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        List<User> userList=new ArrayList<>();
        if(connection!=null){
            try {
                statement=connection.prepareStatement("SELECT * FROM users");
                resultSet=statement.executeQuery();
                User user=null;
                while(resultSet.next()){
                    int id=resultSet.getInt(1);
                    String name=resultSet.getString(2);
                    String email=resultSet.getString(3);
                    String country=resultSet.getString(4);
                    user=new User(id,name,email,country);
                    userList.add(user);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                DBConnection.close();
            }
        }
        return userList;
    }

    @Override
    public void create(User user) {


        ResultSet resultSet=null;
        try(Connection connection=DBConnection.getConnection();
            PreparedStatement statement=connection.prepareStatement("INSERT INTO `userdb`.`users` (`name`, `email`, `country`) VALUES (?, ?, ?);");) {
            statement.setString(1,user.getName());
            statement.setString(2,user.getEmail());
            statement.setString(3,user.getCountry());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public User findById(int id) {
        return findAll().stream().filter(e->e.getId()==id).findFirst().get();
    }

    @Override
    public void edit(int id,String name, String mail,String country) {
        try(
                Connection connection=DBConnection.getConnection();
                PreparedStatement statement=connection.prepareStatement("UPDATE `userdb`.`users` SET `name` = ?, `email` = ?, `country` = ? WHERE (`id` = ?);\n")
                ) {
            statement.setString(1,name);
            statement.setString(2,mail);
            statement.setString(3,country);
            statement.setInt(4,id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try(
                Connection connection=DBConnection.getConnection();
                PreparedStatement statement=connection.prepareStatement("DELETE FROM `userdb`.`users` WHERE (`id` = ?);");
                ) {
            statement.setInt(1,id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
