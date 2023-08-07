package codegym.vn.service;

import codegym.vn.entity.Book;
import codegym.vn.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Integer id);
    boolean save(Book book);
    Page<Book> findAllPage(Pageable pageable);
}
