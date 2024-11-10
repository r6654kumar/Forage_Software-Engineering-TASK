package com.employee_restful_webservice.Employee.Restful.Web.Service.controller;

import com.employee_restful_webservice.Employee.Restful.Web.Service.Employees;
import com.employee_restful_webservice.Employee.Restful.Web.Service.services.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
