package service;

import model.customer;
import reponsitory.customerRepositoryImpl;

import java.util.List;

public class CustomerServiceempl implements ICustomerService{
    customerRepositoryImpl t = new customerRepositoryImpl();

    @Override
    public List<customer> findAll() {
        return t.findAll();
    }

    @Override
    public void save(customer c1) {
        t.save(c1);
    }

    @Override
    public void remove(String name) {
        t.remove(name);
    }

    @Override
    public void edit(String name ,int tuoi, String queQuan) {
        t.edit(name,tuoi,queQuan);
    }

    @Override
    public customer finByName(String name) {
        return findAll().stream().filter(e -> e.getTen().equals(name)).findFirst().get();
    }
}
