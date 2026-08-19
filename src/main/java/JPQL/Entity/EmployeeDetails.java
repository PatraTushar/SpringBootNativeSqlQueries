package JPQL.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_details")
public class EmployeeDetails {

    @Id
    @Column(name = "emp_ID")
    private int empId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Age")
    private int age;

    @Column(name = "Salary")
    private long salary;


    @Column(name = "City")
    private String city;

    @Column(name = "Gender")
    private String gender;


    @Column(name = "Country")
    private String country;

    public EmployeeDetails(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

//    @Override
//    public String toString() {
//        return "Name: " + name +
//                ", Age: " + age +
//                ", Gender: " + gender;
//    }
}
