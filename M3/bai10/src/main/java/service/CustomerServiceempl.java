package service;

import model.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceempl implements ICustomerService{
    private static List<customer> customerList;
    static {
        customerList= new ArrayList<>();
        customerList.add(new customer("Tan",20,"Gia Lai"));
        customerList.add(new customer("Nhi",19,"Da Nang"));
        customerList.add(new customer("Tuan",10,"Quang Nam"));
        customerList.add(new customer("Quan",20,"Nha Trang"));
    }
    @Override
    public List<customer> findAll() {
        return customerList;
    }

    @Override
    public void save(customer c1) {

    }
}
