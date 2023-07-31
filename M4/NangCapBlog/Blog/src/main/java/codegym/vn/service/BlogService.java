package codegym.vn.service;

import codegym.vn.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findById(Integer id);
    Blog save(Blog blog);
    boolean delete(Integer id);
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findBlogByAuthorContaining(Pageable pageable,String author);
}