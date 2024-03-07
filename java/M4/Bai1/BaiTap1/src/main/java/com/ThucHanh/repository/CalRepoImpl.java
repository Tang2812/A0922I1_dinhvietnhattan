package com.ThucHanh.repository;

public class CalRepoImpl implements CalRepo{
    @Override
    public long VND(int USD) {
        return USD*25000;
    }
}
