package codegym.vn.service;

import codegym.vn.entity.Picture;

import java.util.List;

public interface PicService {
    boolean create(Picture t);
    boolean update(Picture t);
    Picture findById(Integer id);
    List<Picture> findAll();
    boolean deleteById(Integer id);
}
