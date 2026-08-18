package NativeSqlQueries.Service;

import NativeSqlQueries.Entity.EmployeeDetails;
import NativeSqlQueries.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeOperations {

    @Autowired
    EmployeeRepository employeeRepository;

    public void loadEmployees() {

        List<EmployeeDetails> emp = employeeRepository.getAllEmployees();

        emp.forEach(System.out::println);
    }


    public void loadEmployeeByCity(String city) {

        List<EmployeeDetails> emp = employeeRepository.getEmployeeByCity(city);
        emp.forEach(System.out::println);
    }

    public void loadEmployeeByCityAndGender(String city, String gender) {

        List<EmployeeDetails> emp = employeeRepository.getEmployeeByCityAndGender(city, gender);
        emp.forEach(System.out::println);
    }


    public void loadEmployeeByCityAndCountry(String city, String country) {

        List<EmployeeDetails> emp = employeeRepository.getEmployeeByCityAndCountry(city, country);
        emp.forEach(System.out::println);
    }


    public  void addingNewEmployees(){

        int records=employeeRepository.addEmployee(45,"TOM",25,100000,"BHUBANESWAR","MALE","INDIA");
        System.out.println("Number Of Record Inserted "+records);
    }

    public void deleteEmployee(int id){

        int deleteRecord= employeeRepository.deleteEmployee(id);
        System.out.println("Number Of Record Deleted "+deleteRecord);
    }


}
