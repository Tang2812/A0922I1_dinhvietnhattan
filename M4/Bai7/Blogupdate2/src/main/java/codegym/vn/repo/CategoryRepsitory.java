package codegym.vn.repo;

import codegym.vn.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepsitory extends CrudRepository<Category,Integer> {
}
