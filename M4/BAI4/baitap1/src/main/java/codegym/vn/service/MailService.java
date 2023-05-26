package codegym.vn.service;

import codegym.vn.model.Mail;

import java.util.List;

public interface MailService {
    Mail findAll();
    void edit(Mail mail2);
}
