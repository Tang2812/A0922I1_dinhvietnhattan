package cogym.vn.service;

import cogym.vn.entity.Song;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SongService {
    List<Song> findAll();
boolean create(Song song);
boolean edit(Song song);
Song findById(Integer id);
boolean delete(int id);
}
