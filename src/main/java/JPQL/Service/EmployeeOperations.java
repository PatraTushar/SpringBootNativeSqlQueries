package JPQL.Service;

import JPQL.Entity.EmployeeDetails;
import JPQL.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeOperations {

    @Autowired
    EmployeeRepository employeeRepository;

    public void allEmployees() {

        List<EmployeeDetails> emp = employeeRepository.loadAllEmployees();

        emp.forEach(System.out::println);
    }


    public void employeesInfoNameAgeGender() {

        List<EmployeeDetails> emp = employeeRepository.loadEmpInfoNameAgeGender();
        emp.forEach(System.out::println);
    }


    public void employeeNames() {

        List<String> name = employeeRepository.loadNames();
        name.forEach(System.out::println);
    }


    public void employeeByCity(String city) {

        List<EmployeeDetails> emp = employeeRepository.getEmployeeByCity(city);
        emp.forEach(System.out::println);
    }
}
