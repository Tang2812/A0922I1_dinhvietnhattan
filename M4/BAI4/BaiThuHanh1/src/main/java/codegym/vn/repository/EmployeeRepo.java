package codegym.vn.repository;

import codegym.vn.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeRepo {
    List<Employee> findAll();
}
