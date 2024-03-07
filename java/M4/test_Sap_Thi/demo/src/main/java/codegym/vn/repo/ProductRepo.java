package codegym.vn.repo;

import codegym.vn.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductRepo extends JpaRepository<Product,Integer> {
}
