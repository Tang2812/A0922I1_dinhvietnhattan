package reponsitory;

import model.customer;

import java.util.ArrayList;
import java.util.List;

public class customerRepositoryImpl implements ICustomerReponsitory{
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
        customerList.add(c1);
    }

    @Override
    public void remove(String c1) {
        int vt=-1;
        for (int i = 0; i <customerList.size() ; i++) {
            if(customerList.get(i).getTen().equals(c1)==true){
                vt=i;
            }
        }
        if(vt>=0){
            customerList.remove(vt);
        }
    }

    @Override
    public void edit(String name, int tuoi, String queQuan) {
        for (int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getTen().equals(name)){
                customerList.get(i).setTuoi(tuoi);
                customerList.get(i).setQuequan(queQuan);
            }
        }

//        int vt=-1;
//        for (int i = 0; i <customerList.size() ; i++) {
//            if(customerList.get(i).getTen().equals(name)==true){
//                vt=i;
//            }
//        }
//        if(vt>=0){
//
//            customerList.get(vt).setTuoi(tuoi);
//            customerList.get(vt).setQuequan(queQuan);
//        }
    }


}
