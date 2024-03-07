package thuchanh.repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CalRepoImpl implements CalRepo{


    @Override
    public float cal(float num1, float num2, String calculation) {
        float result = -999;
        switch (calculation){
            case "+":
                result=  num1+num2;
                break;
            case "-":
                result=  num1-num2;
                break;
            case "*":
                result=  num1*num2;
                break;
            case "/":
                result=   num1/num2;
                break;
        }
        return result;
    }
}
