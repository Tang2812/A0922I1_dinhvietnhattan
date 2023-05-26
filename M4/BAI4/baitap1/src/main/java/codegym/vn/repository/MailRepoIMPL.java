package codegym.vn.repository;

import codegym.vn.model.Mail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MailRepoIMPL implements MailRepo {

    public static Mail mail;
    static {
       mail=new Mail("Englist",25,"King, Asgard");
    }
    @Override
    public Mail findAll() {
        return mail;
    }

    @Override
    public void edit(Mail mail2) {
        mail=mail2;
    }


}
