package com.employee_restful_webservice.Employee.Restful.Web.Service.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee {
    private String employee_ID;
    private String first_name;
    private String last_name;
    private String email;
    private String title;
}
