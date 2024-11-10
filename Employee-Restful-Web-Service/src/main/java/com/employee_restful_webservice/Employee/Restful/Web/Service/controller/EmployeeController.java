package com.employee_restful_webservice.Employee.Restful.Web.Service.controller;

import com.employee_restful_webservice.Employee.Restful.Web.Service.Employees;
import com.employee_restful_webservice.Employee.Restful.Web.Service.model.Employee;
import com.employee_restful_webservice.Employee.Restful.Web.Service.services.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/employees")
public class EmployeeController {
    private final EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager){
        this.employeeManager= employeeManager;
    }
    @GetMapping
    public Employees getAllEmployees(){
        return employeeManager.getEmployees();
    }
    @PostMapping
    public Employees addEmployee(@RequestBody Employee employee){
        employeeManager.addEmployee(employee);
        return employeeManager.getEmployees();
    }

}
