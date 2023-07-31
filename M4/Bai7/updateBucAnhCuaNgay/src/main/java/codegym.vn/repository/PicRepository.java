package codegym.vn.repository;

import codegym.vn.entity.Picture;
import org.springframework.data.repository.CrudRepository;

public interface PicRepository extends CrudRepository<Picture,Integer> {
}
