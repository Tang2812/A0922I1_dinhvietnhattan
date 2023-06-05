package codegym.vn.service;

import codegym.vn.model.ToKhai;

import java.util.List;

public interface khaiBaoService {
    List<ToKhai> findAll();

    List<String> genderList();

    List<String> vehicleList();

    void create(ToKhai toKhai);

    boolean update(ToKhai toKhai);

    ToKhai findByIdentifyCard(String ICard);
}
