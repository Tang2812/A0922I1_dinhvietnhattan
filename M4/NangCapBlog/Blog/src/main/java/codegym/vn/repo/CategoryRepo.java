package codegym.vn.repo;

import codegym.vn.entity.Blog;
import codegym.vn.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category,Integer> {

}
