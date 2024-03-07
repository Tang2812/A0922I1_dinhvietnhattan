package codegym.vn.service;

import codegym.vn.entity.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findById(Integer id);
    boolean create(Blog blog);
    boolean update(Blog blog);
    boolean delete(Integer id);
}