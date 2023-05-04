package service;

import model.customer;

import java.util.List;

public interface ICustomerService {
    List<customer> findAll();
    void save(customer c1);
    void remove(String name);
    void edit(String name,int tuoi,String queQuan);

    customer finByName(String name);
}
