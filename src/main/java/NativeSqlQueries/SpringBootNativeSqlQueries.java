package NativeSqlQueries;

import NativeSqlQueries.Service.EmployeeOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootNativeSqlQueries {

    public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(SpringBootNativeSqlQueries.class);

        EmployeeOperations e = container.getBean(EmployeeOperations.class);
        //  e.loadEmployees();
        // e.loadEmployeeByCity("Hyderabad");
        // e.loadEmployeeByCityAndGender("Pune","Male");

        // e.loadEmployeeByCityAndCountry("New York","USA");
      //  e.addingNewEmployees();
        e.deleteEmployee(1011);


    }
}
