package com.employee_restful_webservice.Employee.Restful.Web.Service;

import com.employee_restful_webservice.Employee.Restful.Web.Service.model.Employee;
import lombok.Data;

import java.util.*;

@Data
public class Employees {
    private List<Employee> employeeList = new ArrayList<>();
    public Employees(){
        this.employeeList= new ArrayList<>();
    }
}
