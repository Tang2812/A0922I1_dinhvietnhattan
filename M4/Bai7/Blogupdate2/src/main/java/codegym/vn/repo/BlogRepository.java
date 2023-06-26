package codegym.vn.repo;

import codegym.vn.entity.Blog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlogRepository extends CrudRepository<Blog,Integer> {
@Query(value = "select b from Blog b order by b.date")
List<Blog> sortByDate();
}
