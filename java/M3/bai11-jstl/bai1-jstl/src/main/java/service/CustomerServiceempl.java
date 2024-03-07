package service;

import model.customer;
import reponsitory.ICustomerReponsitory;
import reponsitory.customerRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceempl implements ICustomerService{
    customerRepositoryImpl t= new customerRepositoryImpl();
    @Override
    public List<customer> findAll() {
        return t.findAll();
    }

    @Override
    public void save(customer c1) {
    t.save(c1);
    }
}
