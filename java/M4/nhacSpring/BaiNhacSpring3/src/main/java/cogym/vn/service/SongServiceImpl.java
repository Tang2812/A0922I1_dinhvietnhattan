package cogym.vn.service;

import cogym.vn.entity.Song;
import cogym.vn.repo.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongServiceImpl implements SongService{
    @Autowired
    private SongRepo repo;
    @Override
    public List<Song> findAll() {
        return (List<Song>) repo.findAll();
    }

    @Override
    public boolean create(Song song) {
        repo.save(song);
        return true;
    }

    @Override
    public boolean edit(Song song) {
        if(repo.existsById(song.getId())) {
            repo.save(song);
            return true;
        }
        return false;
    }

    @Override
    public Song findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public boolean delete(int id) {
        if(repo.existsById(id)){
            repo.deleteById(id);
        return true;
        }
        return false;
    }



}
