package codegym.vn.service;

import codegym.vn.entity.Book;
import codegym.vn.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepo bookRepo;
    @Override
    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return bookRepo.findById(id).orElse(null);
    }

    @Override
    public boolean save(Book book) {
        bookRepo.save(book);
        return false;
    }

    @Override
    public Page<Book> findAllPage(Pageable pageable) {
        return bookRepo.findAll(pageable);
    }
}
