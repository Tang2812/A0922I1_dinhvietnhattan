package codegym.vn.repository.impl;

import codegym.vn.entity.Picture;
import codegym.vn.repository.PicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class PicRepositoryImpl implements PicRepository {
    @PersistenceContext
private EntityManager entityManager;
    @Override
    public boolean create(Picture picture) {
    entityManager.persist(picture);
        return true;
    }

    @Override
    public boolean update(Picture picture) {
        return false;
    }

    @Override
    public Picture findById(int id) {
        return null;
    }

    @Override
    public List<Picture> findAll() {

        return entityManager.createQuery("select p from Picture p").getResultList();
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
