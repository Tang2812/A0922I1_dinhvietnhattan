package codegym.vn.service;

import codegym.vn.entity.Blog;
import codegym.vn.entity.Category;
import codegym.vn.repo.CategoryRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepsitory categoryRepsitory;
    @Override
    public boolean create(Category t) {
        categoryRepsitory.save(t);
        return true;
    }

    @Override
    public boolean update(Category t) {
        if(categoryRepsitory.existsById(t.getCategoryId())){
            categoryRepsitory.save(t);
            return true;
        }
        return false;
    }

    @Override
    public Category findById(int id) {
        return categoryRepsitory.findById(id).orElse(null);
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepsitory.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        categoryRepsitory.deleteById(id);
        return true;
    }

    @Override
    public List<Blog> sortByDate() {


    }
}
