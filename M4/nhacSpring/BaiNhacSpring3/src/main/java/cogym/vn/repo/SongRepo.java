package cogym.vn.repo;

import cogym.vn.entity.Song;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SongRepo extends CrudRepository<Song,Integer> {

}
