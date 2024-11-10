package com.employee_restful_webservice.Employee.Restful.Web.Service.services;

import com.employee_restful_webservice.Employee.Restful.Web.Service.Employees;
import com.employee_restful_webservice.Employee.Restful.Web.Service.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManager {
    private final Employees employees;
    public EmployeeManager(){
        this.employees=new Employees();
        employees.getEmployeeList().add(new Employee("E01","Rahul","Kumar","rahul@test1.com","Software Developer Intern"));
        employees.getEmployeeList().add(new Employee("E02","Rahul1","Kumar","rahul@test2.com","Software Developer 1"));
        employees.getEmployeeList().add(new Employee("E03","Rahul2","Kumar","rahul@test3.com","Software Developer 2"));
        employees.getEmployeeList().add(new Employee("E04","Rahul3","Kumar","rahul@test4.com","Software Developer 3"));
    }
    public Employees getEmployees(){
        return employees;
    }
    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }
}
