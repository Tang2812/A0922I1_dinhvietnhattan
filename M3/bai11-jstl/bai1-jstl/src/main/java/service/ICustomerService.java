package service;

import model.customer;

import java.util.List;

public interface ICustomerService {
    List<customer> findAll();
    void save(customer c1);
}
