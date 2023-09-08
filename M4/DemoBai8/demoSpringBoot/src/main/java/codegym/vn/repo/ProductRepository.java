package codegym.vn.repo;

import codegym.vn.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findAllByNameContaining(String name);

    @Query(value = "select p from Product p where p.startPrice between 100 and :max")
            List<Product> findAllByPrice( @Param("max") double max);
    @Query(value = "select p from Product p where p.category.categoryId = :categoryId")
    List<Product>findAllByCategory(@Param("categoryId")int categoryId);
    @Query(value = "select p from Product p where ( p.name like '%:name%') or (p.startPrice between  100 and :max) or (p.category.categoryId = :categoryId)")
    List<Product> findAllByAll(@Param("name")String name,@Param("max") double max,@Param("categoryId") int categoryId);
}
