package codegym.vn.service;

import codegym.vn.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(Integer id);
    boolean createNewCategory(Category category);
}
