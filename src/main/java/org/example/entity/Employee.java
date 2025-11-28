package org.example.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Cacheable
@org.hibernate.annotations.Cache(
        usage = CacheConcurrencyStrategy.READ_WRITE,
        region = "employeeCache"
)
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer employee_id;
    String employee_name;
    String employee_email;
    String employee_phonenumber;

    public Employee(String employee_name, String employee_email, String employee_phonenumber) {
        this.employee_name = employee_name;
        this.employee_email = employee_email;
        this.employee_phonenumber = employee_phonenumber;
    }
    public Employee(){

    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_phonenumber() {
        return employee_phonenumber;
    }

    public void setEmployee_phonenumber(String employee_phonenumber) {
        this.employee_phonenumber = employee_phonenumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_email='" + employee_email + '\'' +
                ", employee_phonenumber='" + employee_phonenumber + '\'' +
                '}';
    }
}
