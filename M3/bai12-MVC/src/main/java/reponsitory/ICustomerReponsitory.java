package reponsitory;

import model.customer;

import java.util.List;

public interface ICustomerReponsitory {
        List<customer> findAll();
        void save(customer c1);
        void remove(String c1);
        void edit(String name,int tuoi,String queQuan);
    }
