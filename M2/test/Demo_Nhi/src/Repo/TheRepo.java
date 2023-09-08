package Repo;

import model.The;

import java.io.IOException;
import java.util.List;

public interface TheRepo {
    void timKiem(List<The> list);
    void chuyenTien(List<The> list);
    void dangKi(List<The> list) throws IOException;

}
