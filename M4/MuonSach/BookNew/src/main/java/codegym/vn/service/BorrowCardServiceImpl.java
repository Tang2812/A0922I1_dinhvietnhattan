package codegym.vn.service;

import codegym.vn.entity.BorrowCard;
import codegym.vn.repo.BorrowCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BorrowCardServiceImpl implements BorrowCardService{
    @Autowired
    BorrowCardRepo borrowCardRepo;
    @Autowired
    BookService bookService;
    @Autowired
    UserService userService;
    @Override
    public List<BorrowCard> findAll() {
        return borrowCardRepo.findAll();
    }

    @Override
    public BorrowCard findById(Integer id) {
        return borrowCardRepo.findById(id).orElse(null);
    }

    @Override
    public boolean save(BorrowCard borrowCard) {
         borrowCardRepo.save(borrowCard);
    return true;
    }

    @Override
    public boolean borrowBook(Integer bookId,Integer userId) {
        Integer borrowId= new Random().nextInt(10);
        BorrowCard borrowCard=new BorrowCard(borrowId,bookService.findById(bookId),userService.findById(userId));
        bookService.findById(bookId).setQuantity(bookService.findById(bookId).getQuantity()-1);
        this.save(borrowCard);
        return true;
    }
}
