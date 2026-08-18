package NativeSqlQueries.Repository;

import NativeSqlQueries.Entity.EmployeeDetails;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {


    @Query(value = "SELECT * FROM employee_details", nativeQuery = true)
    List<EmployeeDetails> getAllEmployees();


    // Indexed Query Parameters
    @Query(value = "SELECT * FROM employee_details WHERE city=?1 ", nativeQuery = true)
    List<EmployeeDetails> getEmployeeByCity(String city);

    @Query(value = "SELECT * FROM employee_details WHERE city=?1 AND gender=?2 ", nativeQuery = true)
    List<EmployeeDetails> getEmployeeByCityAndGender(String city, String gender);


    // Named Query Parameters

    @Query(value = "SELECT * FROM employee_details WHERE city=:cityName AND country=:countryName ", nativeQuery = true)
    List<EmployeeDetails> getEmployeeByCityAndCountry(@Param("cityName") String city, @Param("countryName") String country);


    // DML Query (INSERT,UPDATE,DELETE)

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO employee_details VALUES(:id,:employeeName,:employeeAge,:employeeSalary,:city,:gender,:country)", nativeQuery = true)
    int addEmployee(@Param("id") int empId, @Param("employeeName") String name, @Param("employeeAge") int age, @Param("employeeSalary") long salary, @Param("city") String city, @Param(("gender")) String gender, @Param("country") String country);


    // DELETE
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM employee_details WHERE emp_id=?1",nativeQuery = true)
    int deleteEmployee(int empId);


}
