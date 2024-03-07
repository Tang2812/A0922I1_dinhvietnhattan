package codegym.vn.repo;

import codegym.vn.entity.Blog;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepo extends CrudRepository<Blog,Integer> {
}
