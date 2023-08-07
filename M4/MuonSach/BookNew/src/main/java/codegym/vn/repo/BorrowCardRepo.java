package codegym.vn.repo;

import codegym.vn.entity.BorrowCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowCardRepo extends JpaRepository<BorrowCard,Integer> {
}
