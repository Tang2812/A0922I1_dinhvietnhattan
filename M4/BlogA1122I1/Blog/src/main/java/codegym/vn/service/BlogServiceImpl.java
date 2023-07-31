package codegym.vn.service;

import codegym.vn.entity.Blog;
import codegym.vn.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogRepo repo;
    @Override
    public List<Blog> findAll() {
        return (List<Blog>) repo.findAll();
    }

    @Override
    public Blog findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public boolean create(Blog blog) {
        repo.save(blog);
        return true;
    }

    @Override
    public boolean update(Blog blog) {
        if(repo.existsById(blog.getId())){
            repo.save(blog);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}
