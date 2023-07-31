package codegym.vn.service;

import codegym.vn.entity.Category;
import codegym.vn.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepo repo;
    @Override
    public List<Category> findAll() {
        return (List<Category>) repo.findAll();
    }

    @Override
    public Category findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public boolean createNewCategory(Category category) {
        repo.save(category);
        return true;
    }
}
