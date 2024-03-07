package codegym.vn.service;

import codegym.vn.entity.Category;
import codegym.vn.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
}

