package codegym.vn.repo;

import codegym.vn.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepo extends JpaRepository<Blog,Integer> {
    Page<Blog> findBlogsByAuthorContaining(Pageable pageable,String author);
}
