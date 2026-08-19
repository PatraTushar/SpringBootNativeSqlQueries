package JPQL;


import JPQL.Service.EmployeeOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJPQLQueries {

    public static void main(String[] args) {

        ConfigurableApplicationContext container= SpringApplication.run(SpringBootJPQLQueries.class);

       EmployeeOperations e= container.getBean(EmployeeOperations.class);
     //  e.allEmployees();
      // e.employeesInfoNameAgeGender();
     //  e.employeeNames();
       e.employeeByCity("Hyderabad");


    }
}
