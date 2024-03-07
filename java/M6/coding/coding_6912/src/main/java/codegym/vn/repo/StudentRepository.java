package codegym.vn.repo;

import codegym.vn.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
