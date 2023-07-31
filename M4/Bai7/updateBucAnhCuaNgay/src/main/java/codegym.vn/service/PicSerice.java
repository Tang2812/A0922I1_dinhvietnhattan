package codegym.vn.service;

import codegym.vn.entity.Picture;

import java.util.List;

public interface PicSerice {
    boolean create(Picture picture);
    boolean update(Picture picture);
    Picture  findById(int id);
    List<Picture> findAll();
    boolean deleteById(int id);
}
