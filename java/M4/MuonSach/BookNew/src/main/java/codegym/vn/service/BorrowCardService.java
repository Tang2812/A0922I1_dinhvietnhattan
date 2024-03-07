package codegym.vn.service;

import codegym.vn.entity.BorrowCard;
import codegym.vn.entity.User;

import java.util.List;

public interface BorrowCardService {
    List<BorrowCard> findAll();

    BorrowCard findById(Integer id);

    boolean save(BorrowCard borrowCard);
    boolean borrowBook(Integer bookId,Integer UserId);
}
