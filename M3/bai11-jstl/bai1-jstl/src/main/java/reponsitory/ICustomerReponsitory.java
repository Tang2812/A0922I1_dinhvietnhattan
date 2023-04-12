package reponsitory;

import model.customer;

import java.util.List;

public interface ICustomerReponsitory {
        List<customer> findAll();
        void save(customer c1);
    }
