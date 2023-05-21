package thuchanh.service;

import thuchanh.repository.CalRepo;
import thuchanh.repository.CalRepoImpl;

public class CalService implements thuchanh.service.Cal {

    CalRepo cal=new CalRepoImpl();

    @Override
    public String trans(String anh) {
        return cal.trans(anh);
    }
}
