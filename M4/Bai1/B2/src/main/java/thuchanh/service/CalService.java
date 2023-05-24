package thuchanh.service;

import thuchanh.repository.CalRepo;
import thuchanh.repository.CalRepoImpl;

public class CalService implements thuchanh.service.Cal {

    CalRepo cal=new CalRepoImpl();


    @Override
    public float Cal(float num1, float num2, String calculation) {
        return cal.Cal(num1, num2, calculation);
    }
}
