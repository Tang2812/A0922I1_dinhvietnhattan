package codegym.vn.service;

import codegym.vn.model.Employee;
import codegym.vn.repository.EmployeeRepo;
import codegym.vn.repository.EmployeeRepoIMPL;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceIMPL implements EmplService{
    EmployeeRepo repo= new EmployeeRepoIMPL();
    @Override
    public List<Employee> findAll() {
        return repo.findAll();
    }
}
