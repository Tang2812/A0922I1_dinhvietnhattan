package com.ThucHanh.service;

import com.ThucHanh.repository.CalRepo;
import com.ThucHanh.repository.CalRepoImpl;

public class CalService implements Cal{
    CalRepo cal=new CalRepoImpl();
    @Override
    public long VND(int USD) {
        return cal.VND(USD);
    }
}
