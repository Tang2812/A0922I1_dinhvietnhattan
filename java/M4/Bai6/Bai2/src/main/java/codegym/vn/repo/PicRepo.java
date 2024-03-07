package codegym.vn.repo;

import codegym.vn.entity.Picture;
import org.springframework.data.repository.CrudRepository;

public interface PicRepo extends CrudRepository<Picture, Integer> {
}
