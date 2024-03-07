package codegym.vn.service;

import codegym.vn.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmplService {
    List<Employee> findAll();
}
