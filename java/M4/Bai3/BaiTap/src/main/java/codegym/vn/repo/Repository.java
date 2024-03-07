package codegym.vn.repo;

import java.util.List;

public interface Repository <T>{
List<T> findAll();
        boolean create(T t);
        boolean update(T t);
        T findById(String id);
        boolean deleteById(String id);
}

