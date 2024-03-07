package codegym.vn.repository.impl;

import codegym.vn.entity.Music;
import codegym.vn.repository.MusicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class MusicRepositoryImpl implements MusicRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public boolean create(Music music) {
        entityManager.persist(music);
        return true;
    }

    @Override
    public boolean update(Music music) {
        entityManager.merge(music);
        return true;
    }

    @Override
    public Music findById(int id) {
        return entityManager.find(Music.class,id);
    }

    @Override
    public List<Music> findAll() {
        return entityManager.createQuery("select m from Music m").getResultList();
    }

    @Override
    public boolean deleteById(int id) {
        entityManager.remove(findById(id));
        return true;
    }
}
