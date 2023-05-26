package codegym.vn.service;

import codegym.vn.model.Mail;
import codegym.vn.repository.MailRepo;
import codegym.vn.repository.MailRepoIMPL;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MailServiceIMPL implements MailService {
    MailRepo repo= new MailRepoIMPL();
    @Override
    public Mail findAll() {
        return repo.findAll();
    }

    @Override
    public void edit(Mail mail2) {
        repo.edit(mail2);
    }
}
