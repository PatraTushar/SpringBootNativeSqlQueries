package JPQL.Repository;

import JPQL.Entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Objects;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails,Integer> {

    @Query(value = "SELECT e FROM EmployeeDetails e",nativeQuery = false)
    List<EmployeeDetails> loadAllEmployees();

    @Query(value = "SELECT new JPQL.Entity.EmployeeDetails(e.name, e.age, e.gender) FROM EmployeeDetails e",nativeQuery = false)
    List<EmployeeDetails> loadEmpInfoNameAgeGender();

    // SELECT new JPQL.Entity.EmployeeDetails(e.name, e.age, e.gender) FROM EmployeeDetails e------>"For every employee, take only the name, age, and gender, and create a new EmployeeDetails object using the constructor."



    @Query(value = "SELECT e.name FROM EmployeeDetails e",nativeQuery = false)
    List<String> loadNames();


    @Query(value = "SELECT emp FROM EmployeeDetails emp WHERE city=:cityName")
    List<EmployeeDetails> getEmployeeByCity(@Param("cityName")String city);


}
