package repository;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    public static final String findAll = "select * from producct";
    public static final String insert = "insert into producct(nameProduct,price,statusProduct,procerducer) value(?,?,?,?)";
    public static List<Product> productList = new ArrayList<>();

//
//   static {
//
//       productList.add(new Product(2,"Realmi",50,"Not","Samsung"));
//       productList.add(new Product(3,"XiaoPhone",10,"Low","Xiao"));
//       productList.add(new Product(4,"MikoPhone",90,"Cute","Raiden"));
//   }
    @Override
    public List<Product> findAll() {
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement=null;
        ResultSet resultSet =null;
        List<Product> productsList=new ArrayList<>();
        if(connection!=null){
            try {
                statement= connection.prepareStatement(findAll);
                resultSet=statement.executeQuery();
                Product product=null;
                while(resultSet.next()){
                    int id=resultSet.getInt(1);
                    String name=resultSet.getString(2);
                    int price=resultSet.getInt(3);
                    String status=resultSet.getString(4);
                    String producer=resultSet.getString(5);
               product =new Product(id,name,price,status,producer);
               productsList.add(product);
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
        return productsList;
    }

    @Override
    public void create(Product product) {

            try (Connection connection=DBConnection.getConnection();
                 PreparedStatement statement=connection.prepareStatement(insert)) {
                ;
            statement.setString(1,product.getName());
            statement.setInt(2,product.getPrice());
            statement.setString(3,product.getStatus());
            statement.setString(4,product.getProducer());
           statement.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

    }

    @Override
    public void remove(int id) {
        try (Connection connection=DBConnection.getConnection();
             PreparedStatement statement=connection.prepareStatement("DELETE FROM producct WHERE id = ?;")) {
            statement.setInt(1,id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product findById(int id) {
return findAll().stream().filter(e->e.getId()==id).findFirst().get();
    }

    @Override
    public void edit(int id,String name, int price, String status, String producer) {
try (
    Connection connection=DBConnection.getConnection();
    PreparedStatement statement=connection.prepareStatement("UPDATE producct SET nameProduct = ?, price = ?, statusProduct = ?, procerducer = ? WHERE id= ?")){

    statement.setString(1,name);
    statement.setInt(2,price);
    statement.setString(3,status);
    statement.setString(4,producer);
        statement.setInt(5,id);
        statement.executeUpdate();
    }catch (SQLException e) {
    throw new RuntimeException(e);
}
    }

}
