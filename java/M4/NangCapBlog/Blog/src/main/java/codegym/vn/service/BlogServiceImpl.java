package codegym.vn.service;

import codegym.vn.entity.Blog;
import codegym.vn.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogRepo blogRepo;
    @Override
    public List<Blog> findAll() {
        return (List<Blog>) blogRepo.findAll();
    }

    @Override
    public Blog findById(Integer id) {
        return blogRepo.findById(id).orElse(null);
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepo.save(blog);
    }

    @Override
    public boolean delete(Integer id) {
        if(blogRepo.existsById(id)){
            blogRepo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepo.findAll(pageable);
    }

    @Override
    public Page<Blog> findBlogByAuthorContaining(Pageable pageable, String author) {
        return blogRepo.findBlogsByAuthorContaining(pageable,author);
    }

}
