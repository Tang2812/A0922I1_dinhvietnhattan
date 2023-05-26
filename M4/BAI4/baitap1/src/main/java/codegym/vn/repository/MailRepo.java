package codegym.vn.repository;

import codegym.vn.model.Mail;

import java.util.List;

public interface MailRepo {
    Mail findAll();
    void edit(Mail mail2);
}
