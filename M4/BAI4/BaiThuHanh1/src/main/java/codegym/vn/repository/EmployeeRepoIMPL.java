package codegym.vn.repository;

import codegym.vn.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EmployeeRepoIMPL implements EmployeeRepo{

    public static ArrayList<Employee> employees=new ArrayList<>();
    static {
        employees.add(new Employee("1","Tan","012"));
        employees.add(new Employee("2","Tuan","034"));
        employees.add(new Employee("3","Khoa","056"));
    }
    @Override
    public List<Employee> findAll() {
        return employees;
    }
}
